/*-
 * #%L
 * OBKV Table Client Framework
 * %%
 * Copyright (C) 2021 OceanBase
 * %%
 * OBKV Table Client Framework is licensed under Mulan PSL v2.
 * You can use this software according to the terms and conditions of the Mulan PSL v2.
 * You may obtain a copy of Mulan PSL v2 at:
 *          http://license.coscl.org.cn/MulanPSL2
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
 * MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PSL v2 for more details.
 * #L%
 */

package com.alipay.oceanbase.rpc.constant;

public interface Constants {
    String OB_TABLE_CLIENT_PREFIX  = "ob.table.client.";
    String EMPTY_STRING            = "";

    String SYS_TENANT              = "sys";
    String PASSWORD                = "password";
    String DATABASE                = "database";

    String PROXY_SYS_USER_NAME     = "proxyro@sys";
    String OCEANBASE_DATABASE      = "oceanbase";
    String ALL_DUMMY_TABLE         = "__all_dummy";
    String READ_CONSISTENCY        = "read_consistency";
    String OB_ROUTE_POLICY         = "ob_route_policy";
    String OCP_ROOT_SERVICE_ACTION = "ObRootServiceInfo";
    String OCP_IDC_REGION_ACTION   = "ObIDCRegionInfo";
    Long   INVALID_TABLET_ID       = 0L;
}
