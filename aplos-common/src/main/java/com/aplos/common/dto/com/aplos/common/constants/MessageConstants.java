package com.aplos.common.dto.com.aplos.common.constants;

/**
 * Created by Aux072 on 18/04/2018.
 */
public interface MessageConstants {

    public interface ServiceErrorMessages {
        public static final String ERR_USERS_NOT_FOUND = "err.aplos.user.not.found";
        public static final String EX_USER_RETRIEVE = "ex.aplos.retrieve.user";

        public static final String ERR_RETRIEVE_USER_PRIVILAGE = "err.aplos.user.privilage.found";
        public static final String EX_RETRIEVE_USER_PRIVILAGE = "ex.aplos.user.privilage.found";

        public static final String ERR_RETRIEVE_ACTIVE_USER = "err.aplos.user.retrieve.active.user";
        public static final String EX_RETRIEVE_ACTIVE_USER = "ex.aplos.user.retrieve.active.user";

        public static final String ERR_RETRIEVE_USER_CLIENT = "err.aplos.user.client.retrieve";
        public static final String EX_RETRIEVE_USER_CLIENT = "ex.aplos.user.client.retrieve";

        public static final String ERR_RETRIEVE_ITEM_FOR_ITEM_NAME = "err.aplos.item.for.itemname";
        public static final String EX_RETRIEVE_ITEM_FOR_ITEM_NAME = "ex.aplos.item.for.itemname";

        public static final String ERR_RETRIEVE_ITEM_FOR_ITEM_NAME_CLIENT_ID = "err.aplos.item.for.itemname.clientid";
        public static final String EX_RETRIEVE_ITEM_FOR_ITEM_NAME_CLIENT_ID = "ex.aplos.item.for.itemname.clientid";

        public static final String ERR_SAVE_CLIENT_ITEM = "err.aplos.save.clientItem";
        public static final String EX_SAVE_CLIENT_ITEM = "ex.aplos.save.clientItem";

        public static final String ERR_SAVE_BATCH = "err.aplos.save.batch";
        public static final String EX_SAVE_BATCH = "ex.aplos.save.batch";

        public static final String ERR_SAVE_BATCH_ITEMS = "err.aplos.save.batch.items";
        public static final String EX_SAVE_BATCH_ITEMS = "ex.aplos.save.batch.items";

        public static final String ERR_RETRIEVE_ITEM_FOR__CLIENT_ID = "err.aplos.retrieve.items.for.client";
        public static final String EX_RETRIEVE_ITEM_FOR__CLIENT_ID  = "ex.aplos.retrieve.items.for.client";

        public static final String ERR_SAVE_CLIENT_BATCH = "err.aplos.save.clinet.batch";
        public static final String EX_SAVE_CLIENT_BATCH = "ex.aplos.save.client.batch";

        public static final String ERR_GET_CLIENT_BATCH = "err.aplos.get.clinet.batch";
        public static final String EX_GET_CLIENT_BATCH = "ex.aplos.get.client.batch";

        public static final String ERR_GET_BATCH_ITEMS_COUNT = "err.get.batchitems.count";
        public static final String EX_GET_BATCH_ITEMS_COUNT = "ex.get.batchitems.count";

        public static final String ERR_RETRIEVE_BATCHITEM_BATCH = "err.aplos.retrieve.batchitem.batch";
        public static final String EX_RETRIEVE_BATCHITEM_BATCH = "ex.aplos.retrieve.batchitem.batch";

        public static final String ERR_RETRIEVE_BATCHITEM_ITEM = "err.aplos.retrieve.batchitem.item";
        public static final String EX_RETRIEVE_BATCHITEM_ITEM = "ex.aplos.retrieve.batchitem.item";

        public static final String ERR_GET_BATCH_ITEMS_COUNT_CLIENT_ID = "err.get.batchitems.count.clientId";
        public static final String EX_GET_BATCH_ITEMS_COUNT_CLIENT_ID = "ex.get.batchitems.count.clientId";

        public static final String ERR_RETRIEVE_BATCHITEM_CLIENT = "err.aplos.retrieve.batchitem.client";
        public static final String EX_RETRIEVE_BATCHITEM_CLIENT = "ex.aplos.retrieve.batchitem.client";

        public static final String ERR_GET_BATCH_ITEMS_COUNT_CLIENT_ID_ITEM_ID = "err.get.batchitems.count.clientId.itemId";
        public static final String EX_GET_BATCH_ITEMS_COUNT_CLIENT_ID_ITEM_ID = "ex.get.batchitems.count.clientId.itemId";

        public static final String ERR_RETRIEVE_CITIES = "err.get.cities";
        public static final String EX_RETRIEVE_CITIES = "ex.get.cities";

        public static final String ERR_RETRIEVE_RATINGS = "err.get.ratings";
        public static final String EX_RETRIEVE_RATINGS = "ex.get.ratings";

        public static final String ERR_SAVE_CLIENT_CUSTOMER = "err.aplos.save.clinet.customer";
        public static final String EX_SAVE_CLIENT_CUSTOMER = "ex.aplos.save.client.customer";

        public static final String ERR_SAVE_CUSTOMER_ADDRESS = "err.aplos.save.customer.address";
        public static final String EX_SAVE_CUSTOMER__ADDRESS = "ex.aplos.save.customer.address";

        public static final String ERR_SAVE_CLIENT_CITY = "err.aplos.save.client.city";
        public static final String EX_SAVE_CLIENT_CITY = "ex.aplos.save.client.city";

        public static final String ERR_RETRIEVE_CLIENT_CITY_FOR_CLIENT_ID = "err.aplos.retrieve.clientcity.for.client";
        public static final String EX_RETRIEVE_CLIENT_CITY_FOR_CLIENT_ID  = "ex.aplos.retrieve.clientcity.for.client";

        public static final String ERR_SAVE_CLIENT_RATING = "err.aplos.save.client.rating";
        public static final String EX_SAVE_CLIENT_RATING = "ex.aplos.save.client.rating";

        public static final String ERR_RETRIEVE_CLIENT_RATING_FOR_CLIENT_ID = "err.aplos.retrieve.client.rating.for.client";
        public static final String EX_RETRIEVE_CLIENT_RATING_FOR_CLIENT_ID  = "ex.aplos.retrieve.client.rating.for.client";

        public static final String ERR_RETRIEVE_CLIENT_CITY_FOR_CITY_NAME_CLIENT_ID = "err.aplos.clientcity.for.cityname.clientid";
        public static final String EX_RETRIEVE_CLIENT_CITY_FOR_CITY_NAME_CLIENT_ID = "ex.aplos.clientcity.for.cityname.clientid";

        public static final String ERR_RETRIEVE_CITY_FOR_CITY_NAME = "err.aplos.city.for.cityname";
        public static final String EX_RETRIEVE_CITY_FOR_CITY_NAME = "ex.aplos.city.for.cityname";

        public static final String ERR_RETRIEVE_CITY_FOR_CITY_NAME_CLIENT_ID = "err.aplos.city.for.cityname.clientid";
        public static final String EX_RETRIEVE_CITY_FOR_CITY_NAME_CLIENT_ID = "ex.aplos.city.for.cityname.clientid";

        public static final String ERR_RETRIEVE_CITY_FOR_CLIENT_ID = "err.aplos.retrieve.city.for.client";
        public static final String EX_RETRIEVE_CITY_FOR_CLIENT_ID  = "ex.aplos.retrieve.city.for.client";

        public static final String ERR_RETRIEVE_RATING_FOR_CLIENT_ID = "err.aplos.retrieve.rating.for.client";
        public static final String EX_RETRIEVE_RATING_FOR_CLIENT_ID  = "ex.aplos.retrieve.rating.for.client";

        public static final String ERR_GENERATE_RATING_FOR_CLIENT_ID = "err.aplos.generate.auto.rating.for.client";
        public static final String EX_GENERATE_RATING_FOR_CLIENT_ID  = "ex.aplos.generate.auto.rating.for.client";

        public static final String ERR_RETRIEVE_RATING_FOR_RATING_NAME_CLIENT_ID = "err.aplos.city.for.ratingName.clientid";
        public static final String EX_RETRIEVE_RATING_FOR_RATING_NAME_CLIENT_ID = "ex.aplos.city.for.ratingName.clientid";

        public static final String ERR_RETRIEVE_RATING_FOR_RATING_NAME = "err.aplos.city.for.ratingName";
        public static final String EX_RETRIEVE_RATING_FOR_RATING_NAME = "ex.aplos.city.for.ratingName";

        public static final String ERR_SAVE_RATING = "err.save.rating";
        public static final String EX_SAVE_RATINGS = "ex.save.rating";

        public static final String ERR_SAVE_CUSTOMER_RATING = "message";
        public static final String EX_SAVE_CUSTOMER_RATING = "ex.aplos.save.customer.rating";

        public static final String ERR_RETRIEVE_CUSTOMER_ADDRESS_FOR_CITY_ID = "err.aplos.retrieve.customer.address.for.cityid";
        public static final String EX_RETRIEVE_CUSTOMER_ADDRESS_FOR_CITY_ID  = "ex.aplos.retrieve.customer.address.for.cityid";

        public static final String ERR_RETRIEVE_CUSTOMER_ADDRESS_COUNT_FOR_CITY_ID = "err.aplos.retrieve.customer.address.count.for.cityid";
        public static final String EX_RETRIEVE_CUSTOMER_ADDRESS_COUNT_FOR_CITY_ID  = "ex.aplos.retrieve.customer.address.count.for.cityid";

        public static final String ERR_RETRIEVE_CUSTOMER_FOR_CITY_ID_CLIENT_ID = "err.aplos.retrieve.customer.for.cityid.clientid";
        public static final String EX_RETRIEVE_CUSTOMER_FOR_CITY_ID_CLIENT_ID  = "ex.aplos.retrieve.customer.for.cityid.clientid";

        public static final String ERR_RETRIEVE_CUSTOMER_COUNT_FOR_CITY_ID_CLIENT_ID_CITY_ID = "err.aplos.retrieve.customer.count.for.cityid.clientid";
        public static final String EX_RETRIEVE_CUSTOMER_COUNT_FOR_CITY_ID_CLIENT_ID_CITY_ID  = "ex.aplos.retrieve.customer.count.for.cityid.clientid";

        public static final String ERR_RETRIEVE_CUSTOMER_FOR_CITY_ID_CLIENT_ID_BY_PAGINATION = "err.aplos.retrieve.customer.count.for.cityid.clientid.by.pagination";
        public static final String EX_RETRIEVE_CUSTOMER_COUNT_FOR_CITY_ID_CLIENT_ID_CITY_ID_BY_PAGINATION  = "ex.aplos.retrieve.customer.count.for.cityid.clientid.by.pagination";

        public static final String ERR_RETRIEVE_RATING_FOR_CUSTOMER_ID = "err.aplos.retrieve.rating.for.customer";
        public static final String EX_RETRIEVE_RATING_FOR_CUSTOMER_ID  = "ex.aplos.retrieve.rating.for.customer";

        public static final String ERR_RETRIEVE_CUSTOMER_SALES_INFO_FOR_CUSTOMER_ID = "err.aplos.retrieve.customer.sales.info.for.customerid";
        public static final String EX_RETRIEVE_CUSTOMER_SALES_INFO_FOR_CUSTOMER_ID  = "ex.aplos.retrieve.customer.sales.info.for.customerid";

        public static final String ERR_RETRIEVE_EXTRA_CUSTOMER_SALES_INFO_FOR_CUSTOME_ID = "err.aplos.retrieve.extra.customer.sales.info.for.customerId";
        public static final String EX_RETRIEVE_EXTRA_CUSTOMER_SALES_INFO_FOR_CUSTOMER_ID  = "ex.aplos.retrieve.extra.customer.sales.info.for.customerId";

        public static final String ERR_GET_BATCH_ITEMS_COUNT_BATCH_ITEM_ID = "err.get.batchitems.count.batchItemId";
        public static final String EX_GET_BATCH_ITEMS_COUNT_BATCH_ITEM_ID = "ex.get.batchitems.count.batchItemId";

        public static final String ERR_SAVE_CLIENT_CUSTOMER_SALE = "err.aplos.save.client.customer.sale";
        public static final String EX_SAVE_CLIENT_CUSTOMER_SALE = "ex.aplos.save.client.customer.sale";

        public static final String ERR_SAVE_SALE = "err.save.sale";
        public static final String EX_SAVE_SALE = "ex.save.sale";

        public static final String ERR_SAVE_SALE_ITEM = "err.save.sale.item";
        public static final String EX_SAVE_SALE_ITEM = "ex.save.sale.item";

        public static final String ERR_RETRIEVE_CUSTOMERS_FOR_CLIENT_ID = "err.aplos.retrieve.customers.for.clientid";
        public static final String EX_RETRIEVE_CUSTOMERS_FOR_CLIENT_ID  = "ex.aplos.retrieve.customers.for.clientid";

        public static final String ERR_RETRIEVE_CLIENT_CUSTOMER_SALE = "err.aplos.retrieve.client.customer.sale";
        public static final String EX_RETRIEVE_CLIENT_CUSTOMER_SALE = "ex.aplos.retrieve.client.customer.sale";

        public static final String ERR_RETRIEVE_COUNT_FOR_CLIENT_CUSTOMER_SALE = "err.aplos.retrieve.count.for.client.customer.sale";
        public static final String EX_RETRIEVE_COUNT_FOR_CLIENT_CUSTOMER_SALE = "ex.aplos.retrieve.count.for.client.customer.sale";

        public static final String ERR_RETRIEVE_CLIENT_USERS = "err.aplos.client.users";
        public static final String EX_RETRIEVE_CLIENT_USERS = "ex.aplos.client.users";

        public static final String ERR_RETRIEVE_CLIENT_USER_SALE = "err.aplos.retrieve.client.user.sale";
        public static final String EX_RETRIEVE_CLIENT_USER_SALE = "ex.aplos.retrieve.client.user.sale";

        public static final String ERR_RETRIEVE_COUNT_FOR_CLIENT_USER_SALE = "err.aplos.retrieve.count.for.client.user.sale";
        public static final String EX_RETRIEVE_COUNT_FOR_CLIENT_USER_SALE = "ex.aplos.retrieve.count.for.client.user.sale";

        public static final String ERR_RETRIEVE_SALE_FOR_CUSTOMER = "err.aplos.retrieve.sales.for.customer";
        public static final String EX_RETRIEVE_SALE_FOR_CUSTOMER = "ex.aplos.retrieve.sales.for.customer";

        public static final String ERR_RETRIEVE_CLIENT_CUSTOMER_SALE_CACHE_PAYMENT = "err.aplos.retrieve.client.customer.sale.cache.payment";
        public static final String EX_RETRIEVE_CLIENT_CUSTOMER_SALE_CACHE_PAYMENT = "ex.aplos.retrieve.client.customer.sale.cache.payment";

        public static final String ERR_SAVE_CLIENT_CUSTOMER_SALE_CACHE_PAYMENT = "err.aplos.save.client.customer.sale.cache.payment";
        public static final String EX_SAVE_CLIENT_CUSTOMER_SALE_CACHE_PAYMENT = "ex.aplos.save.client.customer.sale.cache.payment";

        public static final String ERR_SAVE_CLIENT_CUSTOMER_SALE_OTHER_PAYMENT = "err.aplos.save.client.customer.sale.other.payment";
        public static final String EX_SAVE_CLIENT_CUSTOMER_SALE_OTHER_PAYMENT = "ex.aplos.save.client.customer.sale.other.payment";

        public static final String ERR_SAVE_CLIENT_CUSTOMER_SALE_BANK_PAYMENT = "err.aplos.save.client.customer.sale.bank.payment";
        public static final String EX_SAVE_CLIENT_CUSTOMER_SALE_BANK_PAYMENT = "ex.aplos.save.client.customer.sale.bank.payment";

        public static final String ERR_SAVE_EXTRA_CUSTOMER_SALES_INFO = "err.aplos.save.extra.customer.sales.info";
        public static final String EX_SAVE_EXTRA_CUSTOMER_SALES_INFO  = "ex.aplos.save.extra.customer.sales.info";

        public static final String ERR_RETRIEVE_CLIENT_CUSTOMER_SALE_OTHER_PAYMENT = "err.aplos.retrieve.client.customer.sale.other.payment";
        public static final String EX_RETRIEVE_CLIENT_CUSTOMER_SALE_OTHER_PAYMENT = "ex.aplos.retrieve.client.customer.sale.other.payment";

        public static final String ERR_RETRIEVE_CLIENT_CUSTOMER_SALE_BANK_PAYMENT = "err.aplos.retrieve.client.customer.sale.bank.payment";
        public static final String EX_RETRIEVE_CLIENT_CUSTOMER_SALE_BANK_PAYMENT = "ex.aplos.retrieve.client.customer.sale.bank.payment";


    }

    public interface CustomerDetailsValidationMsgConstants{
    }
}
