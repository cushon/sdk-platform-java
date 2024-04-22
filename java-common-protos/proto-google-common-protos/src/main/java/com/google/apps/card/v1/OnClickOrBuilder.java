/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/card/v1/card.proto

// Protobuf Java Version: 3.25.3
package com.google.apps.card.v1;

public interface OnClickOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.card.v1.OnClick)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If specified, an action is triggered by this `onClick`.
   * </pre>
   *
   * <code>.google.apps.card.v1.Action action = 1;</code>
   *
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   *
   *
   * <pre>
   * If specified, an action is triggered by this `onClick`.
   * </pre>
   *
   * <code>.google.apps.card.v1.Action action = 1;</code>
   *
   * @return The action.
   */
  com.google.apps.card.v1.Action getAction();
  /**
   *
   *
   * <pre>
   * If specified, an action is triggered by this `onClick`.
   * </pre>
   *
   * <code>.google.apps.card.v1.Action action = 1;</code>
   */
  com.google.apps.card.v1.ActionOrBuilder getActionOrBuilder();

  /**
   *
   *
   * <pre>
   * If specified, this `onClick` triggers an open link action.
   * </pre>
   *
   * <code>.google.apps.card.v1.OpenLink open_link = 2;</code>
   *
   * @return Whether the openLink field is set.
   */
  boolean hasOpenLink();
  /**
   *
   *
   * <pre>
   * If specified, this `onClick` triggers an open link action.
   * </pre>
   *
   * <code>.google.apps.card.v1.OpenLink open_link = 2;</code>
   *
   * @return The openLink.
   */
  com.google.apps.card.v1.OpenLink getOpenLink();
  /**
   *
   *
   * <pre>
   * If specified, this `onClick` triggers an open link action.
   * </pre>
   *
   * <code>.google.apps.card.v1.OpenLink open_link = 2;</code>
   */
  com.google.apps.card.v1.OpenLinkOrBuilder getOpenLinkOrBuilder();

  /**
   *
   *
   * <pre>
   * An add-on triggers this action when the action needs to open a
   * link. This differs from the `open_link` above in that this needs to talk
   * to server to get the link. Thus some preparation work is required for
   * web client to do before the open link action response comes back.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.Action open_dynamic_link_action = 3;</code>
   *
   * @return Whether the openDynamicLinkAction field is set.
   */
  boolean hasOpenDynamicLinkAction();
  /**
   *
   *
   * <pre>
   * An add-on triggers this action when the action needs to open a
   * link. This differs from the `open_link` above in that this needs to talk
   * to server to get the link. Thus some preparation work is required for
   * web client to do before the open link action response comes back.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.Action open_dynamic_link_action = 3;</code>
   *
   * @return The openDynamicLinkAction.
   */
  com.google.apps.card.v1.Action getOpenDynamicLinkAction();
  /**
   *
   *
   * <pre>
   * An add-on triggers this action when the action needs to open a
   * link. This differs from the `open_link` above in that this needs to talk
   * to server to get the link. Thus some preparation work is required for
   * web client to do before the open link action response comes back.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.Action open_dynamic_link_action = 3;</code>
   */
  com.google.apps.card.v1.ActionOrBuilder getOpenDynamicLinkActionOrBuilder();

  /**
   *
   *
   * <pre>
   * A new card is pushed to the card stack after clicking if specified.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.Card card = 4;</code>
   *
   * @return Whether the card field is set.
   */
  boolean hasCard();
  /**
   *
   *
   * <pre>
   * A new card is pushed to the card stack after clicking if specified.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.Card card = 4;</code>
   *
   * @return The card.
   */
  com.google.apps.card.v1.Card getCard();
  /**
   *
   *
   * <pre>
   * A new card is pushed to the card stack after clicking if specified.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.Card card = 4;</code>
   */
  com.google.apps.card.v1.CardOrBuilder getCardOrBuilder();

  com.google.apps.card.v1.OnClick.DataCase getDataCase();
}
