package com.shenxin.core.smartpropertymanagement.domain;

/**
 * @Author: gaobaozong
 * @Description: 系统常量类, 每条增加注释
 * @Date: Created in 2018/6/12 - 14:32
 * @Version: V1.0
 */
public class SystemConstant {
    /**
     * 状态常量
     */
    public static final String STATUS_NORMAL = "NORMAL"; //正常
    public static final String STATUS_FREEZE = "FREEZE"; //冻结
    public static final String STATUS_CLOSE = "CLOSE"; //关闭

    /**
     * 功能类型常量
     */
    public static final String FUNC_TYPE_COMPANY = "COMPANY"; //公司
    public static final String FUNC_TYPE_PLATFORM = "PLATFORM"; //平台
    public static final String FUNC_TYPE_BOTH = "BOTH"; //共用

    /**
     * 产权所有人常量
     */
    public static final String OWNER_TYPE_INDIVIDUAL = "INDIVIDUAL"; //个人
    public static final String OWNER_TYPE_COMPANY = "COMPANY"; //公司

    /**
     * 附件存储类型常量
     */
    public static final String ATTACH_STORE_TYPE_LOC = "LOCATION"; //地址
    public static final String ATTACH_STORE_TYPE_CONTENT = "CONTENT"; //内容

    /**
     * 附件类型
     */
    public static final String ATTACH_TYPE_SFZZM = "SFZZM"; //身份证正面
    public static final String ATTACH_TYPE_SFZFM = "SFZFM"; //身份证反面
    public static final String ATTACH_TYPE_YYZZ = "YYZZ"; //营业执照
    public static final String ATTACH_TYPE_CON_B = "商业合同"; //商业合同


    /**
     * 附件格式
     */
    public static final String ATTACH_FILE_PIC = "PIC"; //图片
    public static final String ATTACH_FILE_WORD = "WORD"; //文档



    /**
     * 客户类型常量
     */
    public static final String CLIENT_TYPE_INDIVIDUAL = "INDIVIDUAL"; //个人
    public static final String CLIENT_TYPE_COMPANY = "COMPANY"; //公司

    /**
     * 证件类型
     */
    public static final String ID_TYPE_SFZ = "SFZ"; //身份证
    public static final String ID_TYPE_TBZ = "TBZ"; //台胞证
    public static final String ID_TYPE_JGZ = "JGZ"; //军官证
    public static final String ID_TYPE_HZ = "HZ"; //护照

    /**
     * 业态类型
     */
    public static final String PROPERTY_TYPE_BUSINESS = "BUSINESS"; //商业楼宇
    public static final String PROPERTY_TYPE_RESIDENCE = "RESIDENCE"; //居民住宅
    public static final String PROPERTY_TYPE_HOTEL = "HOTEL"; //酒店

    /**
     * 房屋类型
     */
    public static final String ROOM_TYPE_BUSINESS = "BUSINESS"; //商业住宅
    public static final String ROOM_TYPE_RESIDENCE = "RESIDENCE"; //居民住宅
    public static final String ROOM_TYPE_HOTEL = "HOTEL"; //酒店房屋

    /**
     * 房屋性质
     */
    public static final String ROOM_PROPERTY_RENT = "RENT"; //出租
    public static final String ROOM_PROPERTY_SELFLIVE = "SELFLIVE"; //自住
    public static final String ROOM_PROPERTY_HOLD = "HOLD"; //保留

    /**
     * 房屋状态
     */
    public static final String BUSINESS_ROOM_STATUS_EMPTY = "EMPTY"; //空房
    public static final String BUSINESS_ROOM_STAUTS_RENT = "RENT"; //已出租
    public static final String BUSINESS_ROOM_STATUS_DECORATION = "DECORATION"; //装修封房
    public static final String SELFLIVE_ROOM_STATUS_NORMAL = "EMPTY"; //空房
    public static final String SELFLIVE_ROOM_STATUS_LIVE = "LIVE"; //已入驻
    public static final String HOTLE_ROOM_STATUS_EMPTY = "EMPTY"; //空房
    public static final String HOTEL_ROOM_STATUS_RENT = "RENT"; //已出租
    public static final String HOTEL_ROOM_STATUS_DECORATION = "DECORATION"; //装修封房
    public static final String HOTEL_ROOM_STATUS_BOOKING = "BOOKING"; //预定

    /**
     * 合同类型
     */
    public static final String CONTRACT_TYPE_BIZ_RENT = "BIZ_RENT"; //商业-租赁合同
    public static final String CONTRACT_TYPE_FEE = "FEE"; //普通-费用合同
    public static final String CONTRACT_TYPE_HOTEL_RENT = "HOTEL_RENT"; //酒店-租赁合同
    public static final String CONTRACT_TYPE_HOTEL_BOOKING = "HOTEL_BOOKING"; //酒店-预定

    /**
     * 合同状态
     */
    public static final String CONTRACT_STATUS_NORMAL = "NORMAL"; //正常
    public static final String CONTRACT_STATUS_RETREAT = "RETREAT"; //退房
    public static final String CONTRACT_STATUS_NEED_CONFIRM = "NEED_CONFIRM"; //待确认
    public static final String CONTRACT_STATUS_CLOSE = "CLOSE";//关闭

    /**
     * 收入账单状态
     */
    public static final String FEE_STATUS_INITIAL = "INITIAL"; //新生成初始
    public static final String FEE_STATUS_AUDIT = "AUDIT"; //已修改
    public static final String FEE_STATUS_CHECKED = "CHECKED"; //已审核
    public static final String FEE_STATUS_BILLED = "BILLED"; //已进入应收账单
    public static final String FEE_STATUS_OVERDUE = "OVERDUE"; //已逾期

    /**
     * 应收账单状态
     */
    public static final String BILL_STATUS_INITIAL = "INITIAL"; //新生成初始
    public static final String BILL_STATUS_AUDIT = "AUDIT"; //已修改
    public static final String BILL_STATUS_CHECKED = "CHECKED"; //已审核
    public static final String BILL_STATUS_PAYING = "PAYING"; //支付中
    public static final String BILL_STATUS_PAID = "PAID";//已支付
    public static final String BILL_STATUS_OVERDUE = "OVERDUE"; //已逾期

    /**
     * 应收账单通知/催缴状态
     */
    public static final String BILL_NOTIFY_STATUS_INITIAL = "INITIAL"; //新生成初始
    public static final String BILL_NOTIFY_STATUS_NOTIFIED = "NOTIFIED"; //已通知
    public static final String BILL_PROMOT_STATUS_INITIAL = "INITIAL"; //新生成初始
    public static final String BILL_PROMOT_STATUS_PROMOTED = "PROMOTED"; //已通知

    /**
     * 收入账单类型及支付类型
     */
    public static final String FEE_PAY_TYPE_ONETIME = "ONETIME"; //单次
    public static final String FEE_PAY_TYPE_PERIOD = "PERIOD"; //周期性
    public static final String FEE_TYPE_FWZJ = "FWZJ"; //房屋租金
    public static final String FEE_TYPE_FWYJ = "FWYJ"; //房屋押金
    public static final String FEE_TYPE_FWDJ = "FWDJ"; //房屋定金
    public static final String FEE_TYPE_WYF = "WYF"; //物业费
    public static final String FEE_TYPE_TCF = "TCF"; //停车费
    public static final String FEE_TYPE_WXF = "WXF"; //维修费
    public static final String FEE_TYPE_OTHER = "OTHER";//其他费用

    /**
     * 账务类型
     */
    public static final String ACCOUNTING_TYPE_CREDIT = "CREDIT";//借记，增
    public static final String ACCOUNTING_TYPE_DEBIT = "DEBIT";//贷记，减

    /**
     * 合同房屋状态
     */
//    public static final String CONTRACT_ROOM_STATUS_BOOKING = "BOOKING";//预定
//    public static final String CONTRACT_ROOM_STATUS_CONTRACT = "CONTRACT";//合约期
//    public static final String CONTRACT_ROOM_STATUS_OVERDUE = "OVERDUE";//合约结束


    /**
     * 系统常量
     */
    public static final String SESSION_USER_KEY = "SESSION_USER"; //session中保存的user信息
}
