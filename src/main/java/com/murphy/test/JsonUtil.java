package com.murphy.test;

import org.apache.http.util.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨成雨
 * @create 2017-12-14 16:19
 */
public class JsonUtil {


    public ResponseDataEntity responseData;

    public int responseStatus;

    //自己解析json字符并返回解析好的本类的对象
    public static JsonUtil parse(String str) {

        JsonUtil jsonObj=null;

        if(!TextUtils.isEmpty(str)){
            try {
                //初始化JsonObj对象，此处可不是JSONObject，只是名字像而已
                jsonObj=new JsonUtil();
                //根据json字符串生成JSONObject
                JSONObject object=new JSONObject(str);
                //ResponseDataEntity根据得到的对应的字符串：object.optJSONObject("feed").toString()，解析并返回自己的对象
                jsonObj.responseData=ResponseDataEntity.parse(object.optJSONObject("responseData").toString());
                jsonObj.responseStatus=object.optInt("responseStatus");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return jsonObj;
    }

    public static class ResponseDataEntity {

        public FeedEntity feed;

        //自己解析json字符并返回解析好的本类的对象
        public static ResponseDataEntity parse(String str) {

            ResponseDataEntity responseDataEntity=null;

            if(!TextUtils.isEmpty(str)){
                try {
                    responseDataEntity=new ResponseDataEntity();

                    //根据json字符串生成JSONObject
                    JSONObject object=new JSONObject(str);

                    //FeedEntity根据得到的对应的字符串：object.optJSONObject("feed").toString()，解析并返回自己的对象
                    responseDataEntity.feed=FeedEntity.parse(object.optJSONObject("feed").toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            return responseDataEntity;
        }

        public static class FeedEntity {
            public String author;
            public String description;
            public String feedUrl;
            public String link;
            public String title;
            public String type;

            public List<EntriesEntity> entries;

            //自己解析json字符并返回解析好的本类的对象
            public static FeedEntity parse(String str) {

                FeedEntity feedEntity=null;

                if(!TextUtils.isEmpty(str)){
                    feedEntity=new FeedEntity();
                    try {
                        //解析各个字段
                        JSONObject feedobj=new JSONObject(str);
                        feedEntity.author=feedobj.optString("author");
                        feedEntity.description=feedobj.optString("description");
                        feedEntity.feedUrl=feedobj.optString("feedUrl");
                        feedEntity.link=feedobj.optString("link");
                        feedEntity.title=feedobj.optString("title");
                        feedEntity.type=feedobj.optString("type");

                        //解析集合对象，此处集合是EntriesEntity对象的集合
                        JSONArray array=feedobj.optJSONArray("entries");
                        if(array!=null){
                            List<EntriesEntity> list=new ArrayList<EntriesEntity>();
                            for (int i = 0; i <array.length() ; i++) {
                                //EntriesEntity根据解析出来的对应字符串array.optJSONObject(i).toString()：，解析并返回自己的对象
                                EntriesEntity entity = EntriesEntity.parse(array.optJSONObject(i).toString());
                                list.add(entity);//加入到集合
                            }
                            feedEntity.entries=list;//赋值集合字段
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                return feedEntity;
            }

            public static class EntriesEntity {
                public String author;
                public String content;
                public String contentSnippet;
                public String link;
                public String publishedDate;
                public String title;
                public List<String> categories;

                //自己解析json字符并返回解析好的本类的对象
                public static EntriesEntity parse(String str) {
                    EntriesEntity entriesEntity=null;
                    if(!TextUtils.isEmpty(str)){//不为空
                        try {

                            //解析各个字段
                            entriesEntity=new EntriesEntity();
                            JSONObject jsonObject=new JSONObject(str);
                            entriesEntity.author=jsonObject.optString("author");
                            entriesEntity.content=jsonObject.optString("content");
                            entriesEntity.contentSnippet=jsonObject.optString("contentSnippet");
                            entriesEntity.link=jsonObject.optString("link");
                            entriesEntity.publishedDate=jsonObject.optString("publishedDate");
                            entriesEntity.title=jsonObject.optString("title");
                            //解析集合对象，此处的集合是字符串集合
                            JSONArray jsonArray=jsonObject.optJSONArray("categories");
                            if(jsonArray!=null){
                                List<String> list=new ArrayList<String>();
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    list.add(jsonArray.optString(i));//把解析出来的字符串加入集合
                                }
                                entriesEntity.categories=list;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    return entriesEntity;
                }
            }
        }
    }
}
