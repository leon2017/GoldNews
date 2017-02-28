package com.wangj.gold.entity;

import java.util.List;

/**
 * 当前类注释：gold list entity
 * Author :LeonWang
 * Created  2017/2/28.15:16
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class GoldResultsEntity {

    /**
     * tagsTitleArray : ["Github","开源","移动开发","动效"]
     * category : android
     * tags : {"__type":"Relation","className":"Tag"}
     * hotIndex : 1530
     * updatedAt : 2017-02-28T06:44:49.877Z
     * viewsCount : 728
     * subscribers : {"__type":"Relation","className":"_User"}
     * collectionCount : 80
     * content : 在换肤框架的基础上，增加了一些换肤动画
     * objectId : 58b41590ac502e006cab5db5
     * hot : false
     * original : true
     * createdAt : 2017-02-27T12:03:28.853Z
     * type : article
     * title : Android 炫酷开源皮肤切换动画
     * english : false
     * rankIndex : 6.547418311396259
     * url : https://gold.xitu.io/entry/58b41590ac502e006cab5db5/view
     * entryView : {"__type":"Pointer","className":"EntryView","objectId":"58b415b0570c350069764537"}
     * gfw : false
     * commentsCount : 0
     * user : {"viewedEntriesCount":491,"role":"editor","totalCollectionsCount":6446,"subscribedTagsCount":32,"appliedEditorAt":{"__type":"Date","iso":"2016-11-15T08:11:00.468Z"},"email":"ximu470791413@163.com","followersCount":1145,"updatedAt":"2017-02-28T06:44:50.073Z","postedEntriesCount":47,"commentedEntriesCount":12,"weeklyEmail":5,"collectedEntriesCount":79,"objectId":"579576885bbb500063debfcc","postedPostsCount":2,"isAuthor":true,"username":"wutongke","latestLoginedInAt":{"__type":"Date","iso":"2017-02-27T23:57:21.407Z"},"createdAt":"2016-07-25T02:16:40.001Z","totalHotIndex":143753,"blogAddress":"http://www.jianshu.com/users/0e0821e94979","self_description":"非专业程序员","latestCheckedNotificationAt":{"__type":"Date","iso":"2016-09-26T03:50:10.237Z"},"className":"_User","emailVerified":true,"totalCommentsCount":99,"blacklist":false,"__type":"Pointer","apply":false,"followeesCount":6,"avatar_hd":"https://avatars.githubusercontent.com/u/7380786?v=3","editorType":"md","jobTitle":"程序员","company":"L","authData":{"github":{"access_token":"95dc26a5f5ddc37e97f95eeff25677d5c316ee2b","expiration_in":"36000","uid":"7380786","html_url":"https://github.com/wutongke","bio":null,"username":"wutongke","nickname":"梧桐","avatar_url":"https://avatars.githubusercontent.com/u/7380786?v=3"},"weibo":{"access_token":"2.00jQ3wtB03JiALc2e7734f46QLjvIE","expiration_in":"36000","uid":"1742739941","nickname":"wut_o_n_g","avatar_url":"http://tva1.sinaimg.cn/crop.80.0.1497.1497.180/67e019e5jw1eh5z8jikw7j21kw15uhdt.jpg","description":"爱家人，爱自己"}},"avatar_large":"https://avatars.githubusercontent.com/u/7380786?v=3","mobilePhoneVerified":false}
     * subscribersCount : 0
     * originalUrl : https://github.com/wutongke/AndroidSkinAnimator
     */

    private String category;
    private TagsEntity tags;
    private int hotIndex;
    private String updatedAt;
    private int viewsCount;
    private SubscribersEntity subscribers;
    private int collectionCount;
    private String content;
    private String objectId;
    private boolean hot;
    private boolean original;
    private String createdAt;
    private String type;
    private String title;
    private boolean english;
    private double rankIndex;
    private String url;
    private EntryViewEntity entryView;
    private boolean gfw;
    private int commentsCount;
    private UserEntity user;
    private int subscribersCount;
    private String originalUrl;
    private List<String> tagsTitleArray;

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTags(TagsEntity tags) {
        this.tags = tags;
    }

    public void setHotIndex(int hotIndex) {
        this.hotIndex = hotIndex;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    public void setSubscribers(SubscribersEntity subscribers) {
        this.subscribers = subscribers;
    }

    public void setCollectionCount(int collectionCount) {
        this.collectionCount = collectionCount;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEnglish(boolean english) {
        this.english = english;
    }

    public void setRankIndex(double rankIndex) {
        this.rankIndex = rankIndex;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setEntryView(EntryViewEntity entryView) {
        this.entryView = entryView;
    }

    public void setGfw(boolean gfw) {
        this.gfw = gfw;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public void setSubscribersCount(int subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public void setTagsTitleArray(List<String> tagsTitleArray) {
        this.tagsTitleArray = tagsTitleArray;
    }

    public String getCategory() {
        return category;
    }

    public TagsEntity getTags() {
        return tags;
    }

    public int getHotIndex() {
        return hotIndex;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public SubscribersEntity getSubscribers() {
        return subscribers;
    }

    public int getCollectionCount() {
        return collectionCount;
    }

    public String getContent() {
        return content;
    }

    public String getObjectId() {
        return objectId;
    }

    public boolean getHot() {
        return hot;
    }

    public boolean getOriginal() {
        return original;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public boolean getEnglish() {
        return english;
    }

    public double getRankIndex() {
        return rankIndex;
    }

    public String getUrl() {
        return url;
    }

    public EntryViewEntity getEntryView() {
        return entryView;
    }

    public boolean getGfw() {
        return gfw;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public UserEntity getUser() {
        return user;
    }

    public int getSubscribersCount() {
        return subscribersCount;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public List<String> getTagsTitleArray() {
        return tagsTitleArray;
    }

    public static class TagsEntity {
        /**
         * __type : Relation
         * className : Tag
         */

        private String __type;
        private String className;

        public void set__type(String __type) {
            this.__type = __type;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public String get__type() {
            return __type;
        }

        public String getClassName() {
            return className;
        }
    }

    public static class SubscribersEntity {
        /**
         * __type : Relation
         * className : _User
         */

        private String __type;
        private String className;

        public void set__type(String __type) {
            this.__type = __type;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public String get__type() {
            return __type;
        }

        public String getClassName() {
            return className;
        }
    }

    public static class EntryViewEntity {
        /**
         * __type : Pointer
         * className : EntryView
         * objectId : 58b415b0570c350069764537
         */

        private String __type;
        private String className;
        private String objectId;

        public void set__type(String __type) {
            this.__type = __type;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public String get__type() {
            return __type;
        }

        public String getClassName() {
            return className;
        }

        public String getObjectId() {
            return objectId;
        }
    }

    public static class UserEntity {
        /**
         * viewedEntriesCount : 491
         * role : editor
         * totalCollectionsCount : 6446
         * subscribedTagsCount : 32
         * appliedEditorAt : {"__type":"Date","iso":"2016-11-15T08:11:00.468Z"}
         * email : ximu470791413@163.com
         * followersCount : 1145
         * updatedAt : 2017-02-28T06:44:50.073Z
         * postedEntriesCount : 47
         * commentedEntriesCount : 12
         * weeklyEmail : 5
         * collectedEntriesCount : 79
         * objectId : 579576885bbb500063debfcc
         * postedPostsCount : 2
         * isAuthor : true
         * username : wutongke
         * latestLoginedInAt : {"__type":"Date","iso":"2017-02-27T23:57:21.407Z"}
         * createdAt : 2016-07-25T02:16:40.001Z
         * totalHotIndex : 143753
         * blogAddress : http://www.jianshu.com/users/0e0821e94979
         * self_description : 非专业程序员
         * latestCheckedNotificationAt : {"__type":"Date","iso":"2016-09-26T03:50:10.237Z"}
         * className : _User
         * emailVerified : true
         * totalCommentsCount : 99
         * blacklist : false
         * __type : Pointer
         * apply : false
         * followeesCount : 6
         * avatar_hd : https://avatars.githubusercontent.com/u/7380786?v=3
         * editorType : md
         * jobTitle : 程序员
         * company : L
         * authData : {"github":{"access_token":"95dc26a5f5ddc37e97f95eeff25677d5c316ee2b","expiration_in":"36000","uid":"7380786","html_url":"https://github.com/wutongke","bio":null,"username":"wutongke","nickname":"梧桐","avatar_url":"https://avatars.githubusercontent.com/u/7380786?v=3"},"weibo":{"access_token":"2.00jQ3wtB03JiALc2e7734f46QLjvIE","expiration_in":"36000","uid":"1742739941","nickname":"wut_o_n_g","avatar_url":"http://tva1.sinaimg.cn/crop.80.0.1497.1497.180/67e019e5jw1eh5z8jikw7j21kw15uhdt.jpg","description":"爱家人，爱自己"}}
         * avatar_large : https://avatars.githubusercontent.com/u/7380786?v=3
         * mobilePhoneVerified : false
         */

        private int viewedEntriesCount;
        private String role;
        private int totalCollectionsCount;
        private int subscribedTagsCount;
        private AppliedEditorAtEntity appliedEditorAt;
        private String email;
        private int followersCount;
        private String updatedAt;
        private int postedEntriesCount;
        private int commentedEntriesCount;
        private int weeklyEmail;
        private int collectedEntriesCount;
        private String objectId;
        private int postedPostsCount;
        private boolean isAuthor;
        private String username;
        private LatestLoginedInAtEntity latestLoginedInAt;
        private String createdAt;
        private int totalHotIndex;
        private String blogAddress;
        private String self_description;
        private LatestCheckedNotificationAtEntity latestCheckedNotificationAt;
        private String className;
        private boolean emailVerified;
        private int totalCommentsCount;
        private boolean blacklist;
        private String __type;
        private boolean apply;
        private int followeesCount;
        private String avatar_hd;
        private String editorType;
        private String jobTitle;
        private String company;
        private AuthDataEntity authData;
        private String avatar_large;
        private boolean mobilePhoneVerified;

        public void setViewedEntriesCount(int viewedEntriesCount) {
            this.viewedEntriesCount = viewedEntriesCount;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public void setTotalCollectionsCount(int totalCollectionsCount) {
            this.totalCollectionsCount = totalCollectionsCount;
        }

        public void setSubscribedTagsCount(int subscribedTagsCount) {
            this.subscribedTagsCount = subscribedTagsCount;
        }

        public void setAppliedEditorAt(AppliedEditorAtEntity appliedEditorAt) {
            this.appliedEditorAt = appliedEditorAt;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setFollowersCount(int followersCount) {
            this.followersCount = followersCount;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public void setPostedEntriesCount(int postedEntriesCount) {
            this.postedEntriesCount = postedEntriesCount;
        }

        public void setCommentedEntriesCount(int commentedEntriesCount) {
            this.commentedEntriesCount = commentedEntriesCount;
        }

        public void setWeeklyEmail(int weeklyEmail) {
            this.weeklyEmail = weeklyEmail;
        }

        public void setCollectedEntriesCount(int collectedEntriesCount) {
            this.collectedEntriesCount = collectedEntriesCount;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public void setPostedPostsCount(int postedPostsCount) {
            this.postedPostsCount = postedPostsCount;
        }

        public void setIsAuthor(boolean isAuthor) {
            this.isAuthor = isAuthor;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setLatestLoginedInAt(LatestLoginedInAtEntity latestLoginedInAt) {
            this.latestLoginedInAt = latestLoginedInAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setTotalHotIndex(int totalHotIndex) {
            this.totalHotIndex = totalHotIndex;
        }

        public void setBlogAddress(String blogAddress) {
            this.blogAddress = blogAddress;
        }

        public void setSelf_description(String self_description) {
            this.self_description = self_description;
        }

        public void setLatestCheckedNotificationAt(LatestCheckedNotificationAtEntity latestCheckedNotificationAt) {
            this.latestCheckedNotificationAt = latestCheckedNotificationAt;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public void setEmailVerified(boolean emailVerified) {
            this.emailVerified = emailVerified;
        }

        public void setTotalCommentsCount(int totalCommentsCount) {
            this.totalCommentsCount = totalCommentsCount;
        }

        public void setBlacklist(boolean blacklist) {
            this.blacklist = blacklist;
        }

        public void set__type(String __type) {
            this.__type = __type;
        }

        public void setApply(boolean apply) {
            this.apply = apply;
        }

        public void setFolloweesCount(int followeesCount) {
            this.followeesCount = followeesCount;
        }

        public void setAvatar_hd(String avatar_hd) {
            this.avatar_hd = avatar_hd;
        }

        public void setEditorType(String editorType) {
            this.editorType = editorType;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public void setAuthData(AuthDataEntity authData) {
            this.authData = authData;
        }

        public void setAvatar_large(String avatar_large) {
            this.avatar_large = avatar_large;
        }

        public void setMobilePhoneVerified(boolean mobilePhoneVerified) {
            this.mobilePhoneVerified = mobilePhoneVerified;
        }

        public int getViewedEntriesCount() {
            return viewedEntriesCount;
        }

        public String getRole() {
            return role;
        }

        public int getTotalCollectionsCount() {
            return totalCollectionsCount;
        }

        public int getSubscribedTagsCount() {
            return subscribedTagsCount;
        }

        public AppliedEditorAtEntity getAppliedEditorAt() {
            return appliedEditorAt;
        }

        public String getEmail() {
            return email;
        }

        public int getFollowersCount() {
            return followersCount;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public int getPostedEntriesCount() {
            return postedEntriesCount;
        }

        public int getCommentedEntriesCount() {
            return commentedEntriesCount;
        }

        public int getWeeklyEmail() {
            return weeklyEmail;
        }

        public int getCollectedEntriesCount() {
            return collectedEntriesCount;
        }

        public String getObjectId() {
            return objectId;
        }

        public int getPostedPostsCount() {
            return postedPostsCount;
        }

        public boolean getIsAuthor() {
            return isAuthor;
        }

        public String getUsername() {
            return username;
        }

        public LatestLoginedInAtEntity getLatestLoginedInAt() {
            return latestLoginedInAt;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public int getTotalHotIndex() {
            return totalHotIndex;
        }

        public String getBlogAddress() {
            return blogAddress;
        }

        public String getSelf_description() {
            return self_description;
        }

        public LatestCheckedNotificationAtEntity getLatestCheckedNotificationAt() {
            return latestCheckedNotificationAt;
        }

        public String getClassName() {
            return className;
        }

        public boolean getEmailVerified() {
            return emailVerified;
        }

        public int getTotalCommentsCount() {
            return totalCommentsCount;
        }

        public boolean getBlacklist() {
            return blacklist;
        }

        public String get__type() {
            return __type;
        }

        public boolean getApply() {
            return apply;
        }

        public int getFolloweesCount() {
            return followeesCount;
        }

        public String getAvatar_hd() {
            return avatar_hd;
        }

        public String getEditorType() {
            return editorType;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public String getCompany() {
            return company;
        }

        public AuthDataEntity getAuthData() {
            return authData;
        }

        public String getAvatar_large() {
            return avatar_large;
        }

        public boolean getMobilePhoneVerified() {
            return mobilePhoneVerified;
        }

        public static class AppliedEditorAtEntity {
            /**
             * __type : Date
             * iso : 2016-11-15T08:11:00.468Z
             */

            private String __type;
            private String iso;

            public void set__type(String __type) {
                this.__type = __type;
            }

            public void setIso(String iso) {
                this.iso = iso;
            }

            public String get__type() {
                return __type;
            }

            public String getIso() {
                return iso;
            }
        }

        public static class LatestLoginedInAtEntity {
            /**
             * __type : Date
             * iso : 2017-02-27T23:57:21.407Z
             */

            private String __type;
            private String iso;

            public void set__type(String __type) {
                this.__type = __type;
            }

            public void setIso(String iso) {
                this.iso = iso;
            }

            public String get__type() {
                return __type;
            }

            public String getIso() {
                return iso;
            }
        }

        public static class LatestCheckedNotificationAtEntity {
            /**
             * __type : Date
             * iso : 2016-09-26T03:50:10.237Z
             */

            private String __type;
            private String iso;

            public void set__type(String __type) {
                this.__type = __type;
            }

            public void setIso(String iso) {
                this.iso = iso;
            }

            public String get__type() {
                return __type;
            }

            public String getIso() {
                return iso;
            }
        }

        public static class AuthDataEntity {
            /**
             * github : {"access_token":"95dc26a5f5ddc37e97f95eeff25677d5c316ee2b","expiration_in":"36000","uid":"7380786","html_url":"https://github.com/wutongke","bio":null,"username":"wutongke","nickname":"梧桐","avatar_url":"https://avatars.githubusercontent.com/u/7380786?v=3"}
             * weibo : {"access_token":"2.00jQ3wtB03JiALc2e7734f46QLjvIE","expiration_in":"36000","uid":"1742739941","nickname":"wut_o_n_g","avatar_url":"http://tva1.sinaimg.cn/crop.80.0.1497.1497.180/67e019e5jw1eh5z8jikw7j21kw15uhdt.jpg","description":"爱家人，爱自己"}
             */

            private GithubEntity github;
            private WeiboEntity weibo;

            public void setGithub(GithubEntity github) {
                this.github = github;
            }

            public void setWeibo(WeiboEntity weibo) {
                this.weibo = weibo;
            }

            public GithubEntity getGithub() {
                return github;
            }

            public WeiboEntity getWeibo() {
                return weibo;
            }

            public static class GithubEntity {
                /**
                 * access_token : 95dc26a5f5ddc37e97f95eeff25677d5c316ee2b
                 * expiration_in : 36000
                 * uid : 7380786
                 * html_url : https://github.com/wutongke
                 * bio : null
                 * username : wutongke
                 * nickname : 梧桐
                 * avatar_url : https://avatars.githubusercontent.com/u/7380786?v=3
                 */

                private String access_token;
                private String expiration_in;
                private String uid;
                private String html_url;
                private Object bio;
                private String username;
                private String nickname;
                private String avatar_url;

                public void setAccess_token(String access_token) {
                    this.access_token = access_token;
                }

                public void setExpiration_in(String expiration_in) {
                    this.expiration_in = expiration_in;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public void setHtml_url(String html_url) {
                    this.html_url = html_url;
                }

                public void setBio(Object bio) {
                    this.bio = bio;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public String getAccess_token() {
                    return access_token;
                }

                public String getExpiration_in() {
                    return expiration_in;
                }

                public String getUid() {
                    return uid;
                }

                public String getHtml_url() {
                    return html_url;
                }

                public Object getBio() {
                    return bio;
                }

                public String getUsername() {
                    return username;
                }

                public String getNickname() {
                    return nickname;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }
            }

            public static class WeiboEntity {
                /**
                 * access_token : 2.00jQ3wtB03JiALc2e7734f46QLjvIE
                 * expiration_in : 36000
                 * uid : 1742739941
                 * nickname : wut_o_n_g
                 * avatar_url : http://tva1.sinaimg.cn/crop.80.0.1497.1497.180/67e019e5jw1eh5z8jikw7j21kw15uhdt.jpg
                 * description : 爱家人，爱自己
                 */

                private String access_token;
                private String expiration_in;
                private String uid;
                private String nickname;
                private String avatar_url;
                private String description;

                public void setAccess_token(String access_token) {
                    this.access_token = access_token;
                }

                public void setExpiration_in(String expiration_in) {
                    this.expiration_in = expiration_in;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getAccess_token() {
                    return access_token;
                }

                public String getExpiration_in() {
                    return expiration_in;
                }

                public String getUid() {
                    return uid;
                }

                public String getNickname() {
                    return nickname;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public String getDescription() {
                    return description;
                }
            }
        }
    }
}
