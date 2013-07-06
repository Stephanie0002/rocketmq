// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mq.proto

package com.alibaba.rocketmq.common.protocol;

public final class MQProtos {
    private MQProtos() {
    }


    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    }

    /**
     * Protobuf enum {@code rocketmq.MQRequestCode}
     * 
     * <pre>
     * RPC请求代码
     * </pre>
     */
    public enum MQRequestCode implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>SEND_MESSAGE = 10;</code>
         * 
         * <pre>
         * Broker 发送消息
         * </pre>
         */
        SEND_MESSAGE(0, 10),
        /**
         * <code>PULL_MESSAGE = 11;</code>
         * 
         * <pre>
         * Broker 订阅消息
         * </pre>
         */
        PULL_MESSAGE(1, 11),
        /**
         * <code>QUERY_MESSAGE = 12;</code>
         * 
         * <pre>
         * Broker 查询消息
         * </pre>
         */
        QUERY_MESSAGE(2, 12),
        /**
         * <code>QUERY_BROKER_OFFSET = 13;</code>
         * 
         * <pre>
         * Broker 查询Broker Offset
         * </pre>
         */
        QUERY_BROKER_OFFSET(3, 13),
        /**
         * <code>QUERY_CONSUMER_OFFSET = 14;</code>
         * 
         * <pre>
         * Broker 查询Consumer Offset
         * </pre>
         */
        QUERY_CONSUMER_OFFSET(4, 14),
        /**
         * <code>UPDATE_CONSUMER_OFFSET = 15;</code>
         * 
         * <pre>
         * Broker 更新Consumer Offset
         * </pre>
         */
        UPDATE_CONSUMER_OFFSET(5, 15),
        /**
         * <code>UPDATE_AND_CREATE_TOPIC = 17;</code>
         * 
         * <pre>
         * Broker 更新或者增加一个Topic
         * </pre>
         */
        UPDATE_AND_CREATE_TOPIC(6, 17),
        /**
         * <code>DELETE_TOPIC = 19;</code>
         * 
         * <pre>
         * Broker 删除一个Topic，包含数据与配置
         * </pre>
         */
        DELETE_TOPIC(7, 19),
        /**
         * <code>GET_ALL_TOPIC_CONFIG = 21;</code>
         * 
         * <pre>
         * Broker 获取所有Topic的配置（Slave和Namesrv都会向Master请求此配置）
         * </pre>
         */
        GET_ALL_TOPIC_CONFIG(8, 21),
        /**
         * <code>GET_TOPIC_CONFIG_LIST = 22;</code>
         * 
         * <pre>
         * Broker 获取所有Topic配置（Slave和Namesrv都会向Master请求此配置）
         * </pre>
         */
        GET_TOPIC_CONFIG_LIST(9, 22),
        /**
         * <code>GET_TOPIC_NAME_LIST = 23;</code>
         * 
         * <pre>
         * Broker 获取所有Topic名称列表
         * </pre>
         */
        GET_TOPIC_NAME_LIST(10, 23),
        /**
         * <code>PULL_ALL_CONSUMER_OFFSET = 24;</code>
         * 
         * <pre>
         * Broker Slave获取Master所有Consumer消费进度
         * </pre>
         */
        PULL_ALL_CONSUMER_OFFSET(11, 24),
        /**
         * <code>UPDATE_BROKER_CONFIG = 25;</code>
         * 
         * <pre>
         * Broker 更新Broker上的配置
         * </pre>
         */
        UPDATE_BROKER_CONFIG(12, 25),
        /**
         * <code>GET_BROKER_CONFIG = 26;</code>
         * 
         * <pre>
         * Broker 获取Broker上的配置
         * </pre>
         */
        GET_BROKER_CONFIG(13, 26),
        /**
         * <code>TRIGGER_DELETE_FILES = 27;</code>
         * 
         * <pre>
         * Broker 触发Broker删除文件
         * </pre>
         */
        TRIGGER_DELETE_FILES(14, 27),
        /**
         * <code>GET_BROKER_RUNTIME_INFO = 28;</code>
         * 
         * <pre>
         * Broker 获取Broker运行时信息
         * </pre>
         */
        GET_BROKER_RUNTIME_INFO(15, 28),
        /**
         * <code>SEARCH_OFFSET_BY_TIMESTAMP = 29;</code>
         * 
         * <pre>
         * Broker 根据时间查询队列的Offset
         * </pre>
         */
        SEARCH_OFFSET_BY_TIMESTAMP(16, 29),
        /**
         * <code>GET_MAX_OFFSET = 30;</code>
         * 
         * <pre>
         * Broker 查询队列最大Offset
         * </pre>
         */
        GET_MAX_OFFSET(17, 30),
        /**
         * <code>GET_MIN_OFFSET = 31;</code>
         * 
         * <pre>
         * Broker 查询队列最小Offset
         * </pre>
         */
        GET_MIN_OFFSET(18, 31),
        /**
         * <code>GET_EARLIEST_MSG_STORETIME = 32;</code>
         * 
         * <pre>
         * Broker 查询队列最早消息对应时间
         * </pre>
         */
        GET_EARLIEST_MSG_STORETIME(19, 32),
        /**
         * <code>VIEW_MESSAGE_BY_ID = 33;</code>
         * 
         * <pre>
         * Broker 根据消息ID来查询消息
         * </pre>
         */
        VIEW_MESSAGE_BY_ID(20, 33),
        /**
         * <code>HEART_BEAT = 34;</code>
         * 
         * <pre>
         * Broker Client向Client发送心跳，并注册自身
         * </pre>
         */
        HEART_BEAT(21, 34),
        /**
         * <code>UNREGISTER_CLIENT = 35;</code>
         * 
         * <pre>
         * Broker Client注销
         * </pre>
         */
        UNREGISTER_CLIENT(22, 35),
        /**
         * <code>CONSUMER_SEND_MSG_BACK = 36;</code>
         * 
         * <pre>
         * Broker Consumer将处理不了的消息发回服务器
         * </pre>
         */
        CONSUMER_SEND_MSG_BACK(23, 36),
        /**
         * <code>END_TRANSACTION = 37;</code>
         * 
         * <pre>
         * Broker Commit或者Rollback事务
         * </pre>
         */
        END_TRANSACTION(24, 37),
        /**
         * <code>GET_CONSUMER_LIST_BY_GROUP = 38;</code>
         * 
         * <pre>
         * Broker 获取ConsumerId列表通过GroupName
         * </pre>
         */
        GET_CONSUMER_LIST_BY_GROUP(25, 38),
        /**
         * <code>CHECK_TRANSACTION_STATE = 39;</code>
         * 
         * <pre>
         * Broker 主动向Producer回查事务状态
         * </pre>
         */
        CHECK_TRANSACTION_STATE(26, 39),
        /**
         * <code>NOTIFY_CONSUMER_IDS_CHANGED = 40;</code>
         * 
         * <pre>
         * Broker Broker通知Consumer列表变化
         * </pre>
         */
        NOTIFY_CONSUMER_IDS_CHANGED(27, 40),
        /**
         * <code>LOCK_BATCH_MQ = 41;</code>
         * 
         * <pre>
         * Broker Consumer向Master锁定队列
         * </pre>
         */
        LOCK_BATCH_MQ(28, 41),
        /**
         * <code>UNLOCK_BATCH_MQ = 42;</code>
         * 
         * <pre>
         * Broker Consumer向Master解锁队列
         * </pre>
         */
        UNLOCK_BATCH_MQ(29, 42),
        /**
         * <code>PUT_KV_CONFIG = 100;</code>
         * 
         * <pre>
         * Namesrv 向Namesrv追加KV配置
         * </pre>
         */
        PUT_KV_CONFIG(30, 100),
        /**
         * <code>GET_KV_CONFIG = 101;</code>
         * 
         * <pre>
         * Namesrv 从Namesrv获取KV配置
         * </pre>
         */
        GET_KV_CONFIG(31, 101),
        /**
         * <code>DELETE_KV_CONFIG = 102;</code>
         * 
         * <pre>
         * Namesrv 从Namesrv获取KV配置
         * </pre>
         */
        DELETE_KV_CONFIG(32, 102),
        /**
         * <code>REGISTER_BROKER = 103;</code>
         * 
         * <pre>
         * Namesrv 注册一个Broker，数据都是持久化的，如果存在则覆盖配置
         * </pre>
         */
        REGISTER_BROKER(33, 103),
        /**
         * <code>UNREGISTER_BROKER = 104;</code>
         * 
         * <pre>
         * Namesrv 卸载一个Broker，数据都是持久化的
         * </pre>
         */
        UNREGISTER_BROKER(34, 104),
        /**
         * <code>GET_ROUTEINTO_BY_TOPIC = 105;</code>
         * 
         * <pre>
         * Namesrv 根据Topic获取Broker Name、队列数(包含读队列与写队列)
         * </pre>
         */
        GET_ROUTEINTO_BY_TOPIC(35, 105), ;

        /**
         * <code>SEND_MESSAGE = 10;</code>
         * 
         * <pre>
         * Broker 发送消息
         * </pre>
         */
        public static final int SEND_MESSAGE_VALUE = 10;
        /**
         * <code>PULL_MESSAGE = 11;</code>
         * 
         * <pre>
         * Broker 订阅消息
         * </pre>
         */
        public static final int PULL_MESSAGE_VALUE = 11;
        /**
         * <code>QUERY_MESSAGE = 12;</code>
         * 
         * <pre>
         * Broker 查询消息
         * </pre>
         */
        public static final int QUERY_MESSAGE_VALUE = 12;
        /**
         * <code>QUERY_BROKER_OFFSET = 13;</code>
         * 
         * <pre>
         * Broker 查询Broker Offset
         * </pre>
         */
        public static final int QUERY_BROKER_OFFSET_VALUE = 13;
        /**
         * <code>QUERY_CONSUMER_OFFSET = 14;</code>
         * 
         * <pre>
         * Broker 查询Consumer Offset
         * </pre>
         */
        public static final int QUERY_CONSUMER_OFFSET_VALUE = 14;
        /**
         * <code>UPDATE_CONSUMER_OFFSET = 15;</code>
         * 
         * <pre>
         * Broker 更新Consumer Offset
         * </pre>
         */
        public static final int UPDATE_CONSUMER_OFFSET_VALUE = 15;
        /**
         * <code>UPDATE_AND_CREATE_TOPIC = 17;</code>
         * 
         * <pre>
         * Broker 更新或者增加一个Topic
         * </pre>
         */
        public static final int UPDATE_AND_CREATE_TOPIC_VALUE = 17;
        /**
         * <code>DELETE_TOPIC = 19;</code>
         * 
         * <pre>
         * Broker 删除一个Topic，包含数据与配置
         * </pre>
         */
        public static final int DELETE_TOPIC_VALUE = 19;
        /**
         * <code>GET_ALL_TOPIC_CONFIG = 21;</code>
         * 
         * <pre>
         * Broker 获取所有Topic的配置（Slave和Namesrv都会向Master请求此配置）
         * </pre>
         */
        public static final int GET_ALL_TOPIC_CONFIG_VALUE = 21;
        /**
         * <code>GET_TOPIC_CONFIG_LIST = 22;</code>
         * 
         * <pre>
         * Broker 获取所有Topic配置（Slave和Namesrv都会向Master请求此配置）
         * </pre>
         */
        public static final int GET_TOPIC_CONFIG_LIST_VALUE = 22;
        /**
         * <code>GET_TOPIC_NAME_LIST = 23;</code>
         * 
         * <pre>
         * Broker 获取所有Topic名称列表
         * </pre>
         */
        public static final int GET_TOPIC_NAME_LIST_VALUE = 23;
        /**
         * <code>PULL_ALL_CONSUMER_OFFSET = 24;</code>
         * 
         * <pre>
         * Broker Slave获取Master所有Consumer消费进度
         * </pre>
         */
        public static final int PULL_ALL_CONSUMER_OFFSET_VALUE = 24;
        /**
         * <code>UPDATE_BROKER_CONFIG = 25;</code>
         * 
         * <pre>
         * Broker 更新Broker上的配置
         * </pre>
         */
        public static final int UPDATE_BROKER_CONFIG_VALUE = 25;
        /**
         * <code>GET_BROKER_CONFIG = 26;</code>
         * 
         * <pre>
         * Broker 获取Broker上的配置
         * </pre>
         */
        public static final int GET_BROKER_CONFIG_VALUE = 26;
        /**
         * <code>TRIGGER_DELETE_FILES = 27;</code>
         * 
         * <pre>
         * Broker 触发Broker删除文件
         * </pre>
         */
        public static final int TRIGGER_DELETE_FILES_VALUE = 27;
        /**
         * <code>GET_BROKER_RUNTIME_INFO = 28;</code>
         * 
         * <pre>
         * Broker 获取Broker运行时信息
         * </pre>
         */
        public static final int GET_BROKER_RUNTIME_INFO_VALUE = 28;
        /**
         * <code>SEARCH_OFFSET_BY_TIMESTAMP = 29;</code>
         * 
         * <pre>
         * Broker 根据时间查询队列的Offset
         * </pre>
         */
        public static final int SEARCH_OFFSET_BY_TIMESTAMP_VALUE = 29;
        /**
         * <code>GET_MAX_OFFSET = 30;</code>
         * 
         * <pre>
         * Broker 查询队列最大Offset
         * </pre>
         */
        public static final int GET_MAX_OFFSET_VALUE = 30;
        /**
         * <code>GET_MIN_OFFSET = 31;</code>
         * 
         * <pre>
         * Broker 查询队列最小Offset
         * </pre>
         */
        public static final int GET_MIN_OFFSET_VALUE = 31;
        /**
         * <code>GET_EARLIEST_MSG_STORETIME = 32;</code>
         * 
         * <pre>
         * Broker 查询队列最早消息对应时间
         * </pre>
         */
        public static final int GET_EARLIEST_MSG_STORETIME_VALUE = 32;
        /**
         * <code>VIEW_MESSAGE_BY_ID = 33;</code>
         * 
         * <pre>
         * Broker 根据消息ID来查询消息
         * </pre>
         */
        public static final int VIEW_MESSAGE_BY_ID_VALUE = 33;
        /**
         * <code>HEART_BEAT = 34;</code>
         * 
         * <pre>
         * Broker Client向Client发送心跳，并注册自身
         * </pre>
         */
        public static final int HEART_BEAT_VALUE = 34;
        /**
         * <code>UNREGISTER_CLIENT = 35;</code>
         * 
         * <pre>
         * Broker Client注销
         * </pre>
         */
        public static final int UNREGISTER_CLIENT_VALUE = 35;
        /**
         * <code>CONSUMER_SEND_MSG_BACK = 36;</code>
         * 
         * <pre>
         * Broker Consumer将处理不了的消息发回服务器
         * </pre>
         */
        public static final int CONSUMER_SEND_MSG_BACK_VALUE = 36;
        /**
         * <code>END_TRANSACTION = 37;</code>
         * 
         * <pre>
         * Broker Commit或者Rollback事务
         * </pre>
         */
        public static final int END_TRANSACTION_VALUE = 37;
        /**
         * <code>GET_CONSUMER_LIST_BY_GROUP = 38;</code>
         * 
         * <pre>
         * Broker 获取ConsumerId列表通过GroupName
         * </pre>
         */
        public static final int GET_CONSUMER_LIST_BY_GROUP_VALUE = 38;
        /**
         * <code>CHECK_TRANSACTION_STATE = 39;</code>
         * 
         * <pre>
         * Broker 主动向Producer回查事务状态
         * </pre>
         */
        public static final int CHECK_TRANSACTION_STATE_VALUE = 39;
        /**
         * <code>NOTIFY_CONSUMER_IDS_CHANGED = 40;</code>
         * 
         * <pre>
         * Broker Broker通知Consumer列表变化
         * </pre>
         */
        public static final int NOTIFY_CONSUMER_IDS_CHANGED_VALUE = 40;
        /**
         * <code>LOCK_BATCH_MQ = 41;</code>
         * 
         * <pre>
         * Broker Consumer向Master锁定队列
         * </pre>
         */
        public static final int LOCK_BATCH_MQ_VALUE = 41;
        /**
         * <code>UNLOCK_BATCH_MQ = 42;</code>
         * 
         * <pre>
         * Broker Consumer向Master解锁队列
         * </pre>
         */
        public static final int UNLOCK_BATCH_MQ_VALUE = 42;
        /**
         * <code>PUT_KV_CONFIG = 100;</code>
         * 
         * <pre>
         * Namesrv 向Namesrv追加KV配置
         * </pre>
         */
        public static final int PUT_KV_CONFIG_VALUE = 100;
        /**
         * <code>GET_KV_CONFIG = 101;</code>
         * 
         * <pre>
         * Namesrv 从Namesrv获取KV配置
         * </pre>
         */
        public static final int GET_KV_CONFIG_VALUE = 101;
        /**
         * <code>DELETE_KV_CONFIG = 102;</code>
         * 
         * <pre>
         * Namesrv 从Namesrv获取KV配置
         * </pre>
         */
        public static final int DELETE_KV_CONFIG_VALUE = 102;
        /**
         * <code>REGISTER_BROKER = 103;</code>
         * 
         * <pre>
         * Namesrv 注册一个Broker，数据都是持久化的，如果存在则覆盖配置
         * </pre>
         */
        public static final int REGISTER_BROKER_VALUE = 103;
        /**
         * <code>UNREGISTER_BROKER = 104;</code>
         * 
         * <pre>
         * Namesrv 卸载一个Broker，数据都是持久化的
         * </pre>
         */
        public static final int UNREGISTER_BROKER_VALUE = 104;
        /**
         * <code>GET_ROUTEINTO_BY_TOPIC = 105;</code>
         * 
         * <pre>
         * Namesrv 根据Topic获取Broker Name、队列数(包含读队列与写队列)
         * </pre>
         */
        public static final int GET_ROUTEINTO_BY_TOPIC_VALUE = 105;


        public final int getNumber() {
            return value;
        }


        public static MQRequestCode valueOf(int value) {
            switch (value) {
            case 10:
                return SEND_MESSAGE;
            case 11:
                return PULL_MESSAGE;
            case 12:
                return QUERY_MESSAGE;
            case 13:
                return QUERY_BROKER_OFFSET;
            case 14:
                return QUERY_CONSUMER_OFFSET;
            case 15:
                return UPDATE_CONSUMER_OFFSET;
            case 17:
                return UPDATE_AND_CREATE_TOPIC;
            case 19:
                return DELETE_TOPIC;
            case 21:
                return GET_ALL_TOPIC_CONFIG;
            case 22:
                return GET_TOPIC_CONFIG_LIST;
            case 23:
                return GET_TOPIC_NAME_LIST;
            case 24:
                return PULL_ALL_CONSUMER_OFFSET;
            case 25:
                return UPDATE_BROKER_CONFIG;
            case 26:
                return GET_BROKER_CONFIG;
            case 27:
                return TRIGGER_DELETE_FILES;
            case 28:
                return GET_BROKER_RUNTIME_INFO;
            case 29:
                return SEARCH_OFFSET_BY_TIMESTAMP;
            case 30:
                return GET_MAX_OFFSET;
            case 31:
                return GET_MIN_OFFSET;
            case 32:
                return GET_EARLIEST_MSG_STORETIME;
            case 33:
                return VIEW_MESSAGE_BY_ID;
            case 34:
                return HEART_BEAT;
            case 35:
                return UNREGISTER_CLIENT;
            case 36:
                return CONSUMER_SEND_MSG_BACK;
            case 37:
                return END_TRANSACTION;
            case 38:
                return GET_CONSUMER_LIST_BY_GROUP;
            case 39:
                return CHECK_TRANSACTION_STATE;
            case 40:
                return NOTIFY_CONSUMER_IDS_CHANGED;
            case 41:
                return LOCK_BATCH_MQ;
            case 42:
                return UNLOCK_BATCH_MQ;
            case 100:
                return PUT_KV_CONFIG;
            case 101:
                return GET_KV_CONFIG;
            case 102:
                return DELETE_KV_CONFIG;
            case 103:
                return REGISTER_BROKER;
            case 104:
                return UNREGISTER_BROKER;
            case 105:
                return GET_ROUTEINTO_BY_TOPIC;
            default:
                return null;
            }
        }


        public static com.google.protobuf.Internal.EnumLiteMap<MQRequestCode> internalGetValueMap() {
            return internalValueMap;
        }

        private static com.google.protobuf.Internal.EnumLiteMap<MQRequestCode> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<MQRequestCode>() {
                    public MQRequestCode findValueByNumber(int number) {
                        return MQRequestCode.valueOf(number);
                    }
                };


        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(index);
        }


        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }


        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return com.alibaba.rocketmq.common.protocol.MQProtos.getDescriptor().getEnumTypes().get(0);
        }

        private static final MQRequestCode[] VALUES = values();


        public static MQRequestCode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private final int index;
        private final int value;


        private MQRequestCode(int index, int value) {
            this.index = index;
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:rocketmq.MQRequestCode)
    }

    /**
     * Protobuf enum {@code rocketmq.MQResponseCode}
     * 
     * <pre>
     * RPC应答代码
     * </pre>
     */
    public enum MQResponseCode implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>FLUSH_DISK_TIMEOUT = 10;</code>
         * 
         * <pre>
         * Broker 刷盘超时
         * </pre>
         */
        FLUSH_DISK_TIMEOUT(0, 10),
        /**
         * <code>SLAVE_NOT_AVAILABLE = 11;</code>
         * 
         * <pre>
         * Broker 同步双写，Slave不可用
         * </pre>
         */
        SLAVE_NOT_AVAILABLE(1, 11),
        /**
         * <code>FLUSH_SLAVE_TIMEOUT = 12;</code>
         * 
         * <pre>
         * Broker 同步双写，等待Slave应答超时
         * </pre>
         */
        FLUSH_SLAVE_TIMEOUT(2, 12),
        /**
         * <code>MESSAGE_ILLEGAL = 13;</code>
         * 
         * <pre>
         * Broker 消息非法
         * </pre>
         */
        MESSAGE_ILLEGAL(3, 13),
        /**
         * <code>SERVICE_NOT_AVAILABLE = 14;</code>
         * 
         * <pre>
         * Broker, Namesrv 服务不可用，可能是正在关闭或者权限问题
         * </pre>
         */
        SERVICE_NOT_AVAILABLE(4, 14),
        /**
         * <code>VERSION_NOT_SUPPORTED = 15;</code>
         * 
         * <pre>
         * Broker, Namesrv 版本号不支持
         * </pre>
         */
        VERSION_NOT_SUPPORTED(5, 15),
        /**
         * <code>NO_PERMISSION = 16;</code>
         * 
         * <pre>
         * Broker, Namesrv 无权限执行此操作，可能是发、收、或者其他操作
         * </pre>
         */
        NO_PERMISSION(6, 16),
        /**
         * <code>TOPIC_NOT_EXIST = 17;</code>
         * 
         * <pre>
         * Broker, Topic不存在
         * </pre>
         */
        TOPIC_NOT_EXIST(7, 17),
        /**
         * <code>TOPIC_EXIST_ALREADY = 18;</code>
         * 
         * <pre>
         * Broker, Topic已经存在，创建Topic
         * </pre>
         */
        TOPIC_EXIST_ALREADY(8, 18),
        /**
         * <code>PULL_NOT_FOUND = 19;</code>
         * 
         * <pre>
         * Broker 拉消息未找到（请求的Offset等于最大Offset，最大Offset无对应消息）
         * </pre>
         */
        PULL_NOT_FOUND(9, 19),
        /**
         * <code>PULL_RETRY_IMMEDIATELY = 20;</code>
         * 
         * <pre>
         * Broker 可能被过滤，或者误通知等
         * </pre>
         */
        PULL_RETRY_IMMEDIATELY(10, 20),
        /**
         * <code>PULL_OFFSET_MOVED = 21;</code>
         * 
         * <pre>
         * Broker 拉消息请求的Offset不合法，太小或太大
         * </pre>
         */
        PULL_OFFSET_MOVED(11, 21),
        /**
         * <code>QUERY_NOT_FOUND = 22;</code>
         * 
         * <pre>
         * Broker 查询消息未找到
         * </pre>
         */
        QUERY_NOT_FOUND(12, 22),
        /**
         * <code>SUBSCRIPTION_PARSE_FAILED = 23;</code>
         * 
         * <pre>
         * Broker 订阅关系解析失败
         * </pre>
         */
        SUBSCRIPTION_PARSE_FAILED(13, 23),
        /**
         * <code>SUBSCRIPTION_NOT_EXIST = 24;</code>
         * 
         * <pre>
         * Broker 订阅关系不存在
         * </pre>
         */
        SUBSCRIPTION_NOT_EXIST(14, 24),
        /**
         * <code>SUBSCRIPTION_NOT_LATEST = 25;</code>
         * 
         * <pre>
         * Broker 订阅关系不是最新的
         * </pre>
         */
        SUBSCRIPTION_NOT_LATEST(15, 25),
        /**
         * <code>SUBSCRIPTION_GROUP_NOT_EXIST = 26;</code>
         * 
         * <pre>
         * Broker 订阅组不存在
         * </pre>
         */
        SUBSCRIPTION_GROUP_NOT_EXIST(16, 26),
        /**
         * <code>TRANSACTION_SHOULD_COMMIT = 200;</code>
         * 
         * <pre>
         * Producer 事务应该被提交
         * </pre>
         */
        TRANSACTION_SHOULD_COMMIT(17, 200),
        /**
         * <code>TRANSACTION_SHOULD_ROLLBACK = 201;</code>
         * 
         * <pre>
         * Producer 事务应该被回滚
         * </pre>
         */
        TRANSACTION_SHOULD_ROLLBACK(18, 201),
        /**
         * <code>TRANSACTION_STATE_UNKNOW = 202;</code>
         * 
         * <pre>
         * Producer 事务状态未知
         * </pre>
         */
        TRANSACTION_STATE_UNKNOW(19, 202),
        /**
         * <code>TRANSACTION_STATE_GROUP_WRONG = 203;</code>
         * 
         * <pre>
         * Producer ProducerGroup错误
         * </pre>
         */
        TRANSACTION_STATE_GROUP_WRONG(20, 203), ;

        /**
         * <code>FLUSH_DISK_TIMEOUT = 10;</code>
         * 
         * <pre>
         * Broker 刷盘超时
         * </pre>
         */
        public static final int FLUSH_DISK_TIMEOUT_VALUE = 10;
        /**
         * <code>SLAVE_NOT_AVAILABLE = 11;</code>
         * 
         * <pre>
         * Broker 同步双写，Slave不可用
         * </pre>
         */
        public static final int SLAVE_NOT_AVAILABLE_VALUE = 11;
        /**
         * <code>FLUSH_SLAVE_TIMEOUT = 12;</code>
         * 
         * <pre>
         * Broker 同步双写，等待Slave应答超时
         * </pre>
         */
        public static final int FLUSH_SLAVE_TIMEOUT_VALUE = 12;
        /**
         * <code>MESSAGE_ILLEGAL = 13;</code>
         * 
         * <pre>
         * Broker 消息非法
         * </pre>
         */
        public static final int MESSAGE_ILLEGAL_VALUE = 13;
        /**
         * <code>SERVICE_NOT_AVAILABLE = 14;</code>
         * 
         * <pre>
         * Broker, Namesrv 服务不可用，可能是正在关闭或者权限问题
         * </pre>
         */
        public static final int SERVICE_NOT_AVAILABLE_VALUE = 14;
        /**
         * <code>VERSION_NOT_SUPPORTED = 15;</code>
         * 
         * <pre>
         * Broker, Namesrv 版本号不支持
         * </pre>
         */
        public static final int VERSION_NOT_SUPPORTED_VALUE = 15;
        /**
         * <code>NO_PERMISSION = 16;</code>
         * 
         * <pre>
         * Broker, Namesrv 无权限执行此操作，可能是发、收、或者其他操作
         * </pre>
         */
        public static final int NO_PERMISSION_VALUE = 16;
        /**
         * <code>TOPIC_NOT_EXIST = 17;</code>
         * 
         * <pre>
         * Broker, Topic不存在
         * </pre>
         */
        public static final int TOPIC_NOT_EXIST_VALUE = 17;
        /**
         * <code>TOPIC_EXIST_ALREADY = 18;</code>
         * 
         * <pre>
         * Broker, Topic已经存在，创建Topic
         * </pre>
         */
        public static final int TOPIC_EXIST_ALREADY_VALUE = 18;
        /**
         * <code>PULL_NOT_FOUND = 19;</code>
         * 
         * <pre>
         * Broker 拉消息未找到（请求的Offset等于最大Offset，最大Offset无对应消息）
         * </pre>
         */
        public static final int PULL_NOT_FOUND_VALUE = 19;
        /**
         * <code>PULL_RETRY_IMMEDIATELY = 20;</code>
         * 
         * <pre>
         * Broker 可能被过滤，或者误通知等
         * </pre>
         */
        public static final int PULL_RETRY_IMMEDIATELY_VALUE = 20;
        /**
         * <code>PULL_OFFSET_MOVED = 21;</code>
         * 
         * <pre>
         * Broker 拉消息请求的Offset不合法，太小或太大
         * </pre>
         */
        public static final int PULL_OFFSET_MOVED_VALUE = 21;
        /**
         * <code>QUERY_NOT_FOUND = 22;</code>
         * 
         * <pre>
         * Broker 查询消息未找到
         * </pre>
         */
        public static final int QUERY_NOT_FOUND_VALUE = 22;
        /**
         * <code>SUBSCRIPTION_PARSE_FAILED = 23;</code>
         * 
         * <pre>
         * Broker 订阅关系解析失败
         * </pre>
         */
        public static final int SUBSCRIPTION_PARSE_FAILED_VALUE = 23;
        /**
         * <code>SUBSCRIPTION_NOT_EXIST = 24;</code>
         * 
         * <pre>
         * Broker 订阅关系不存在
         * </pre>
         */
        public static final int SUBSCRIPTION_NOT_EXIST_VALUE = 24;
        /**
         * <code>SUBSCRIPTION_NOT_LATEST = 25;</code>
         * 
         * <pre>
         * Broker 订阅关系不是最新的
         * </pre>
         */
        public static final int SUBSCRIPTION_NOT_LATEST_VALUE = 25;
        /**
         * <code>SUBSCRIPTION_GROUP_NOT_EXIST = 26;</code>
         * 
         * <pre>
         * Broker 订阅组不存在
         * </pre>
         */
        public static final int SUBSCRIPTION_GROUP_NOT_EXIST_VALUE = 26;
        /**
         * <code>TRANSACTION_SHOULD_COMMIT = 200;</code>
         * 
         * <pre>
         * Producer 事务应该被提交
         * </pre>
         */
        public static final int TRANSACTION_SHOULD_COMMIT_VALUE = 200;
        /**
         * <code>TRANSACTION_SHOULD_ROLLBACK = 201;</code>
         * 
         * <pre>
         * Producer 事务应该被回滚
         * </pre>
         */
        public static final int TRANSACTION_SHOULD_ROLLBACK_VALUE = 201;
        /**
         * <code>TRANSACTION_STATE_UNKNOW = 202;</code>
         * 
         * <pre>
         * Producer 事务状态未知
         * </pre>
         */
        public static final int TRANSACTION_STATE_UNKNOW_VALUE = 202;
        /**
         * <code>TRANSACTION_STATE_GROUP_WRONG = 203;</code>
         * 
         * <pre>
         * Producer ProducerGroup错误
         * </pre>
         */
        public static final int TRANSACTION_STATE_GROUP_WRONG_VALUE = 203;


        public final int getNumber() {
            return value;
        }


        public static MQResponseCode valueOf(int value) {
            switch (value) {
            case 10:
                return FLUSH_DISK_TIMEOUT;
            case 11:
                return SLAVE_NOT_AVAILABLE;
            case 12:
                return FLUSH_SLAVE_TIMEOUT;
            case 13:
                return MESSAGE_ILLEGAL;
            case 14:
                return SERVICE_NOT_AVAILABLE;
            case 15:
                return VERSION_NOT_SUPPORTED;
            case 16:
                return NO_PERMISSION;
            case 17:
                return TOPIC_NOT_EXIST;
            case 18:
                return TOPIC_EXIST_ALREADY;
            case 19:
                return PULL_NOT_FOUND;
            case 20:
                return PULL_RETRY_IMMEDIATELY;
            case 21:
                return PULL_OFFSET_MOVED;
            case 22:
                return QUERY_NOT_FOUND;
            case 23:
                return SUBSCRIPTION_PARSE_FAILED;
            case 24:
                return SUBSCRIPTION_NOT_EXIST;
            case 25:
                return SUBSCRIPTION_NOT_LATEST;
            case 26:
                return SUBSCRIPTION_GROUP_NOT_EXIST;
            case 200:
                return TRANSACTION_SHOULD_COMMIT;
            case 201:
                return TRANSACTION_SHOULD_ROLLBACK;
            case 202:
                return TRANSACTION_STATE_UNKNOW;
            case 203:
                return TRANSACTION_STATE_GROUP_WRONG;
            default:
                return null;
            }
        }


        public static com.google.protobuf.Internal.EnumLiteMap<MQResponseCode> internalGetValueMap() {
            return internalValueMap;
        }

        private static com.google.protobuf.Internal.EnumLiteMap<MQResponseCode> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<MQResponseCode>() {
                    public MQResponseCode findValueByNumber(int number) {
                        return MQResponseCode.valueOf(number);
                    }
                };


        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(index);
        }


        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }


        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return com.alibaba.rocketmq.common.protocol.MQProtos.getDescriptor().getEnumTypes().get(1);
        }

        private static final MQResponseCode[] VALUES = values();


        public static MQResponseCode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private final int index;
        private final int value;


        private MQResponseCode(int index, int value) {
            this.index = index;
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:rocketmq.MQResponseCode)
    }


    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        java.lang.String[] descriptorData =
                {
                 "\n\010mq.proto\022\010rocketmq\032\016remoting.proto*\373\006\n"
                         + "\rMQRequestCode\022\020\n\014SEND_MESSAGE\020\n\022\020\n\014PULL"
                         + "_MESSAGE\020\013\022\021\n\rQUERY_MESSAGE\020\014\022\027\n\023QUERY_B"
                         + "ROKER_OFFSET\020\r\022\031\n\025QUERY_CONSUMER_OFFSET\020"
                         + "\016\022\032\n\026UPDATE_CONSUMER_OFFSET\020\017\022\033\n\027UPDATE_"
                         + "AND_CREATE_TOPIC\020\021\022\020\n\014DELETE_TOPIC\020\023\022\030\n\024"
                         + "GET_ALL_TOPIC_CONFIG\020\025\022\031\n\025GET_TOPIC_CONF"
                         + "IG_LIST\020\026\022\027\n\023GET_TOPIC_NAME_LIST\020\027\022\034\n\030PU"
                         + "LL_ALL_CONSUMER_OFFSET\020\030\022\030\n\024UPDATE_BROKE"
                         + "R_CONFIG\020\031\022\025\n\021GET_BROKER_CONFIG\020\032\022\030\n\024TRI",
                 "GGER_DELETE_FILES\020\033\022\033\n\027GET_BROKER_RUNTIM"
                         + "E_INFO\020\034\022\036\n\032SEARCH_OFFSET_BY_TIMESTAMP\020\035"
                         + "\022\022\n\016GET_MAX_OFFSET\020\036\022\022\n\016GET_MIN_OFFSET\020\037"
                         + "\022\036\n\032GET_EARLIEST_MSG_STORETIME\020 \022\026\n\022VIEW"
                         + "_MESSAGE_BY_ID\020!\022\016\n\nHEART_BEAT\020\"\022\025\n\021UNRE"
                         + "GISTER_CLIENT\020#\022\032\n\026CONSUMER_SEND_MSG_BAC"
                         + "K\020$\022\023\n\017END_TRANSACTION\020%\022\036\n\032GET_CONSUMER"
                         + "_LIST_BY_GROUP\020&\022\033\n\027CHECK_TRANSACTION_ST"
                         + "ATE\020\'\022\037\n\033NOTIFY_CONSUMER_IDS_CHANGED\020(\022\021"
                         + "\n\rLOCK_BATCH_MQ\020)\022\023\n\017UNLOCK_BATCH_MQ\020*\022\021",
                 "\n\rPUT_KV_CONFIG\020d\022\021\n\rGET_KV_CONFIG\020e\022\024\n\020"
                         + "DELETE_KV_CONFIG\020f\022\023\n\017REGISTER_BROKER\020g\022"
                         + "\025\n\021UNREGISTER_BROKER\020h\022\032\n\026GET_ROUTEINTO_"
                         + "BY_TOPIC\020i*\301\004\n\016MQResponseCode\022\026\n\022FLUSH_D"
                         + "ISK_TIMEOUT\020\n\022\027\n\023SLAVE_NOT_AVAILABLE\020\013\022\027"
                         + "\n\023FLUSH_SLAVE_TIMEOUT\020\014\022\023\n\017MESSAGE_ILLEG"
                         + "AL\020\r\022\031\n\025SERVICE_NOT_AVAILABLE\020\016\022\031\n\025VERSI"
                         + "ON_NOT_SUPPORTED\020\017\022\021\n\rNO_PERMISSION\020\020\022\023\n"
                         + "\017TOPIC_NOT_EXIST\020\021\022\027\n\023TOPIC_EXIST_ALREAD"
                         + "Y\020\022\022\022\n\016PULL_NOT_FOUND\020\023\022\032\n\026PULL_RETRY_IM",
                 "MEDIATELY\020\024\022\025\n\021PULL_OFFSET_MOVED\020\025\022\023\n\017QU"
                         + "ERY_NOT_FOUND\020\026\022\035\n\031SUBSCRIPTION_PARSE_FA"
                         + "ILED\020\027\022\032\n\026SUBSCRIPTION_NOT_EXIST\020\030\022\033\n\027SU"
                         + "BSCRIPTION_NOT_LATEST\020\031\022 \n\034SUBSCRIPTION_"
                         + "GROUP_NOT_EXIST\020\032\022\036\n\031TRANSACTION_SHOULD_"
                         + "COMMIT\020\310\001\022 \n\033TRANSACTION_SHOULD_ROLLBACK"
                         + "\020\311\001\022\035\n\030TRANSACTION_STATE_UNKNOW\020\312\001\022\"\n\035TR"
                         + "ANSACTION_STATE_GROUP_WRONG\020\313\001B2\n$com.al"
                         + "ibaba.rocketmq.common.protocolB\010MQProtos" + "H\001" };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(
                descriptorData,
                new com.google.protobuf.Descriptors.FileDescriptor[] { com.alibaba.rocketmq.remoting.protocol.RemotingProtos
                    .getDescriptor(), }, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}
