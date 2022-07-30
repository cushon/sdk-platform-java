/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.asset.v1.samples;

// [START asset_v1_generated_assetserviceclient_listassets_resourcename_sync]
import com.google.api.resourcenames.ResourceName;
import com.google.cloud.asset.v1.Asset;
import com.google.cloud.asset.v1.AssetServiceClient;
import java.util.HashMap;
import java.util.Map;

public class SyncListAssetsResourcename {

  public static void main(String[] args) throws Exception {
    syncListAssetsResourcename();
  }

  public static void syncListAssetsResourcename() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
      ResourceName parent =
          new ResourceName() {
            @Override
            public Map<String, String> getFieldValuesMap() {
              Map<String, String> fieldValuesMap = new HashMap<>();
              fieldValuesMap.put("parent", "parent-4715/parent-4715");
              return fieldValuesMap;
            }

            @Override
            public String getFieldValue(String fieldName) {
              return getFieldValuesMap().get(fieldName);
            }

            @Override
            public String toString() {
              return "parent-4715/parent-4715";
            }
          };
      for (Asset element : assetServiceClient.listAssets(parent).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END asset_v1_generated_assetserviceclient_listassets_resourcename_sync]