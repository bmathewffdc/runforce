package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class QuickAction extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public QuickAction() {}

    /* Cache the typeInfo instead of declaring static fields throughout*/
    private transient java.util.Map<String, com.sforce.ws.bind.TypeInfo> typeInfoCache = new java.util.HashMap<String, com.sforce.ws.bind.TypeInfo>();
    private com.sforce.ws.bind.TypeInfo _lookupTypeInfo(String fieldName, String namespace, String name, String typeNS, String type, int minOcc, int maxOcc, boolean elementForm) {
      com.sforce.ws.bind.TypeInfo typeInfo = typeInfoCache.get(fieldName);
      if (typeInfo == null) {
        typeInfo = new com.sforce.ws.bind.TypeInfo(namespace, name, typeNS, type, minOcc, maxOcc, elementForm);
        typeInfoCache.put(fieldName, typeInfo);
      }
      return typeInfo;
    }

    /**
     * element : canvas of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean canvas__is_set = false;

    private java.lang.String canvas;

    public java.lang.String getCanvas() {
      return canvas;
    }

    public void setCanvas(java.lang.String canvas) {
      this.canvas = canvas;
      canvas__is_set = true;
    }

    protected void setCanvas(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("canvas", "urn:metadata.tooling.soap.sforce.com","canvas","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCanvas(__typeMapper.readString(__in, _lookupTypeInfo("canvas", "urn:metadata.tooling.soap.sforce.com","canvas","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCanvas(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("canvas", "urn:metadata.tooling.soap.sforce.com","canvas","http://www.w3.org/2001/XMLSchema","string",0,1,true), canvas, canvas__is_set);
    }

    /**
     * element : description of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean description__is_set = false;

    private java.lang.String description;

    public java.lang.String getDescription() {
      return description;
    }

    public void setDescription(java.lang.String description) {
      this.description = description;
      description__is_set = true;
    }

    protected void setDescription(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDescription(__typeMapper.readString(__in, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDescription(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true), description, description__is_set);
    }

    /**
     * element : flowDefinition of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean flowDefinition__is_set = false;

    private java.lang.String flowDefinition;

    public java.lang.String getFlowDefinition() {
      return flowDefinition;
    }

    public void setFlowDefinition(java.lang.String flowDefinition) {
      this.flowDefinition = flowDefinition;
      flowDefinition__is_set = true;
    }

    protected void setFlowDefinition(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("flowDefinition", "urn:metadata.tooling.soap.sforce.com","flowDefinition","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFlowDefinition(__typeMapper.readString(__in, _lookupTypeInfo("flowDefinition", "urn:metadata.tooling.soap.sforce.com","flowDefinition","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFlowDefinition(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("flowDefinition", "urn:metadata.tooling.soap.sforce.com","flowDefinition","http://www.w3.org/2001/XMLSchema","string",0,1,true), flowDefinition, flowDefinition__is_set);
    }

    /**
     * element : height of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean height__is_set = false;

    private int height;

    public int getHeight() {
      return height;
    }

    public void setHeight(int height) {
      this.height = height;
      height__is_set = true;
    }

    protected void setHeight(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("height", "urn:metadata.tooling.soap.sforce.com","height","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setHeight((int)__typeMapper.readInt(__in, _lookupTypeInfo("height", "urn:metadata.tooling.soap.sforce.com","height","http://www.w3.org/2001/XMLSchema","int",0,1,true), int.class));
      }
    }

    private void writeFieldHeight(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("height", "urn:metadata.tooling.soap.sforce.com","height","http://www.w3.org/2001/XMLSchema","int",0,1,true), height, height__is_set);
    }

    /**
     * element : icon of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean icon__is_set = false;

    private java.lang.String icon;

    public java.lang.String getIcon() {
      return icon;
    }

    public void setIcon(java.lang.String icon) {
      this.icon = icon;
      icon__is_set = true;
    }

    protected void setIcon(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("icon", "urn:metadata.tooling.soap.sforce.com","icon","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setIcon(__typeMapper.readString(__in, _lookupTypeInfo("icon", "urn:metadata.tooling.soap.sforce.com","icon","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldIcon(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("icon", "urn:metadata.tooling.soap.sforce.com","icon","http://www.w3.org/2001/XMLSchema","string",0,1,true), icon, icon__is_set);
    }

    /**
     * element : isProtected of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean isProtected__is_set = false;

    private boolean isProtected;

    public boolean getIsProtected() {
      return isProtected;
    }

    public boolean isIsProtected() {
      return isProtected;
    }

    public void setIsProtected(boolean isProtected) {
      this.isProtected = isProtected;
      isProtected__is_set = true;
    }

    protected void setIsProtected(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("isProtected", "urn:metadata.tooling.soap.sforce.com","isProtected","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsProtected(__typeMapper.readBoolean(__in, _lookupTypeInfo("isProtected", "urn:metadata.tooling.soap.sforce.com","isProtected","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldIsProtected(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("isProtected", "urn:metadata.tooling.soap.sforce.com","isProtected","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), isProtected, isProtected__is_set);
    }

    /**
     * element : label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean label__is_set = false;

    private java.lang.String label;

    public java.lang.String getLabel() {
      return label;
    }

    public void setLabel(java.lang.String label) {
      this.label = label;
      label__is_set = true;
    }

    protected void setLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLabel(__typeMapper.readString(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",0,1,true), label, label__is_set);
    }

    /**
     * element : lightningComponent of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean lightningComponent__is_set = false;

    private java.lang.String lightningComponent;

    public java.lang.String getLightningComponent() {
      return lightningComponent;
    }

    public void setLightningComponent(java.lang.String lightningComponent) {
      this.lightningComponent = lightningComponent;
      lightningComponent__is_set = true;
    }

    protected void setLightningComponent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("lightningComponent", "urn:metadata.tooling.soap.sforce.com","lightningComponent","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLightningComponent(__typeMapper.readString(__in, _lookupTypeInfo("lightningComponent", "urn:metadata.tooling.soap.sforce.com","lightningComponent","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLightningComponent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("lightningComponent", "urn:metadata.tooling.soap.sforce.com","lightningComponent","http://www.w3.org/2001/XMLSchema","string",0,1,true), lightningComponent, lightningComponent__is_set);
    }

    /**
     * element : optionsCreateFeedItem of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean optionsCreateFeedItem__is_set = false;

    private boolean optionsCreateFeedItem;

    public boolean getOptionsCreateFeedItem() {
      return optionsCreateFeedItem;
    }

    public boolean isOptionsCreateFeedItem() {
      return optionsCreateFeedItem;
    }

    public void setOptionsCreateFeedItem(boolean optionsCreateFeedItem) {
      this.optionsCreateFeedItem = optionsCreateFeedItem;
      optionsCreateFeedItem__is_set = true;
    }

    protected void setOptionsCreateFeedItem(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("optionsCreateFeedItem", "urn:metadata.tooling.soap.sforce.com","optionsCreateFeedItem","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setOptionsCreateFeedItem(__typeMapper.readBoolean(__in, _lookupTypeInfo("optionsCreateFeedItem", "urn:metadata.tooling.soap.sforce.com","optionsCreateFeedItem","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldOptionsCreateFeedItem(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("optionsCreateFeedItem", "urn:metadata.tooling.soap.sforce.com","optionsCreateFeedItem","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), optionsCreateFeedItem, optionsCreateFeedItem__is_set);
    }

    /**
     * element : page of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean page__is_set = false;

    private java.lang.String page;

    public java.lang.String getPage() {
      return page;
    }

    public void setPage(java.lang.String page) {
      this.page = page;
      page__is_set = true;
    }

    protected void setPage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("page", "urn:metadata.tooling.soap.sforce.com","page","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setPage(__typeMapper.readString(__in, _lookupTypeInfo("page", "urn:metadata.tooling.soap.sforce.com","page","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldPage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("page", "urn:metadata.tooling.soap.sforce.com","page","http://www.w3.org/2001/XMLSchema","string",0,1,true), page, page__is_set);
    }

    /**
     * element : quickActionLayout of type {urn:metadata.tooling.soap.sforce.com}QuickActionLayout
     * java type: com.sforce.soap.tooling.metadata.QuickActionLayout
     */
    private boolean quickActionLayout__is_set = false;

    private com.sforce.soap.tooling.metadata.QuickActionLayout quickActionLayout;

    public com.sforce.soap.tooling.metadata.QuickActionLayout getQuickActionLayout() {
      return quickActionLayout;
    }

    public void setQuickActionLayout(com.sforce.soap.tooling.metadata.QuickActionLayout quickActionLayout) {
      this.quickActionLayout = quickActionLayout;
      quickActionLayout__is_set = true;
    }

    protected void setQuickActionLayout(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("quickActionLayout", "urn:metadata.tooling.soap.sforce.com","quickActionLayout","urn:metadata.tooling.soap.sforce.com","QuickActionLayout",0,1,true))) {
        setQuickActionLayout((com.sforce.soap.tooling.metadata.QuickActionLayout)__typeMapper.readObject(__in, _lookupTypeInfo("quickActionLayout", "urn:metadata.tooling.soap.sforce.com","quickActionLayout","urn:metadata.tooling.soap.sforce.com","QuickActionLayout",0,1,true), com.sforce.soap.tooling.metadata.QuickActionLayout.class));
      }
    }

    private void writeFieldQuickActionLayout(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("quickActionLayout", "urn:metadata.tooling.soap.sforce.com","quickActionLayout","urn:metadata.tooling.soap.sforce.com","QuickActionLayout",0,1,true), quickActionLayout, quickActionLayout__is_set);
    }

    /**
     * element : standardLabel of type {urn:tooling.soap.sforce.com}QuickActionLabel
     * java type: com.sforce.soap.tooling.QuickActionLabel
     */
    private boolean standardLabel__is_set = false;

    private com.sforce.soap.tooling.QuickActionLabel standardLabel;

    public com.sforce.soap.tooling.QuickActionLabel getStandardLabel() {
      return standardLabel;
    }

    public void setStandardLabel(com.sforce.soap.tooling.QuickActionLabel standardLabel) {
      this.standardLabel = standardLabel;
      standardLabel__is_set = true;
    }

    protected void setStandardLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("standardLabel", "urn:metadata.tooling.soap.sforce.com","standardLabel","urn:tooling.soap.sforce.com","QuickActionLabel",0,1,true))) {
        setStandardLabel((com.sforce.soap.tooling.QuickActionLabel)__typeMapper.readObject(__in, _lookupTypeInfo("standardLabel", "urn:metadata.tooling.soap.sforce.com","standardLabel","urn:tooling.soap.sforce.com","QuickActionLabel",0,1,true), com.sforce.soap.tooling.QuickActionLabel.class));
      }
    }

    private void writeFieldStandardLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("standardLabel", "urn:metadata.tooling.soap.sforce.com","standardLabel","urn:tooling.soap.sforce.com","QuickActionLabel",0,1,true), standardLabel, standardLabel__is_set);
    }

    /**
     * element : successMessage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean successMessage__is_set = false;

    private java.lang.String successMessage;

    public java.lang.String getSuccessMessage() {
      return successMessage;
    }

    public void setSuccessMessage(java.lang.String successMessage) {
      this.successMessage = successMessage;
      successMessage__is_set = true;
    }

    protected void setSuccessMessage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("successMessage", "urn:metadata.tooling.soap.sforce.com","successMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSuccessMessage(__typeMapper.readString(__in, _lookupTypeInfo("successMessage", "urn:metadata.tooling.soap.sforce.com","successMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSuccessMessage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("successMessage", "urn:metadata.tooling.soap.sforce.com","successMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true), successMessage, successMessage__is_set);
    }

    /**
     * element : targetObject of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean targetObject__is_set = false;

    private java.lang.String targetObject;

    public java.lang.String getTargetObject() {
      return targetObject;
    }

    public void setTargetObject(java.lang.String targetObject) {
      this.targetObject = targetObject;
      targetObject__is_set = true;
    }

    protected void setTargetObject(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("targetObject", "urn:metadata.tooling.soap.sforce.com","targetObject","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setTargetObject(__typeMapper.readString(__in, _lookupTypeInfo("targetObject", "urn:metadata.tooling.soap.sforce.com","targetObject","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTargetObject(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("targetObject", "urn:metadata.tooling.soap.sforce.com","targetObject","http://www.w3.org/2001/XMLSchema","string",0,1,true), targetObject, targetObject__is_set);
    }

    /**
     * element : targetParentField of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean targetParentField__is_set = false;

    private java.lang.String targetParentField;

    public java.lang.String getTargetParentField() {
      return targetParentField;
    }

    public void setTargetParentField(java.lang.String targetParentField) {
      this.targetParentField = targetParentField;
      targetParentField__is_set = true;
    }

    protected void setTargetParentField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("targetParentField", "urn:metadata.tooling.soap.sforce.com","targetParentField","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setTargetParentField(__typeMapper.readString(__in, _lookupTypeInfo("targetParentField", "urn:metadata.tooling.soap.sforce.com","targetParentField","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTargetParentField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("targetParentField", "urn:metadata.tooling.soap.sforce.com","targetParentField","http://www.w3.org/2001/XMLSchema","string",0,1,true), targetParentField, targetParentField__is_set);
    }

    /**
     * element : targetRecordType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean targetRecordType__is_set = false;

    private java.lang.String targetRecordType;

    public java.lang.String getTargetRecordType() {
      return targetRecordType;
    }

    public void setTargetRecordType(java.lang.String targetRecordType) {
      this.targetRecordType = targetRecordType;
      targetRecordType__is_set = true;
    }

    protected void setTargetRecordType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("targetRecordType", "urn:metadata.tooling.soap.sforce.com","targetRecordType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setTargetRecordType(__typeMapper.readString(__in, _lookupTypeInfo("targetRecordType", "urn:metadata.tooling.soap.sforce.com","targetRecordType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTargetRecordType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("targetRecordType", "urn:metadata.tooling.soap.sforce.com","targetRecordType","http://www.w3.org/2001/XMLSchema","string",0,1,true), targetRecordType, targetRecordType__is_set);
    }

    /**
     * element : type of type {urn:tooling.soap.sforce.com}QuickActionType
     * java type: com.sforce.soap.tooling.QuickActionType
     */
    private boolean type__is_set = false;

    private com.sforce.soap.tooling.QuickActionType type;

    public com.sforce.soap.tooling.QuickActionType getType() {
      return type;
    }

    public void setType(com.sforce.soap.tooling.QuickActionType type) {
      this.type = type;
      type__is_set = true;
    }

    protected void setType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","QuickActionType",1,1,true))) {
        setType((com.sforce.soap.tooling.QuickActionType)__typeMapper.readObject(__in, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","QuickActionType",1,1,true), com.sforce.soap.tooling.QuickActionType.class));
      }
    }

    private void writeFieldType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","QuickActionType",1,1,true), type, type__is_set);
    }

    /**
     * element : width of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean width__is_set = false;

    private int width;

    public int getWidth() {
      return width;
    }

    public void setWidth(int width) {
      this.width = width;
      width__is_set = true;
    }

    protected void setWidth(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("width", "urn:metadata.tooling.soap.sforce.com","width","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setWidth((int)__typeMapper.readInt(__in, _lookupTypeInfo("width", "urn:metadata.tooling.soap.sforce.com","width","http://www.w3.org/2001/XMLSchema","int",0,1,true), int.class));
      }
    }

    private void writeFieldWidth(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("width", "urn:metadata.tooling.soap.sforce.com","width","http://www.w3.org/2001/XMLSchema","int",0,1,true), width, width__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "QuickAction");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       writeFields1(__out, __typeMapper);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        super.loadFields(__in, __typeMapper);
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[QuickAction ");
      sb.append(super.toString());
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldCanvas(__out, __typeMapper);
      writeFieldDescription(__out, __typeMapper);
      writeFieldFlowDefinition(__out, __typeMapper);
      writeFieldHeight(__out, __typeMapper);
      writeFieldIcon(__out, __typeMapper);
      writeFieldIsProtected(__out, __typeMapper);
      writeFieldLabel(__out, __typeMapper);
      writeFieldLightningComponent(__out, __typeMapper);
      writeFieldOptionsCreateFeedItem(__out, __typeMapper);
      writeFieldPage(__out, __typeMapper);
      writeFieldQuickActionLayout(__out, __typeMapper);
      writeFieldStandardLabel(__out, __typeMapper);
      writeFieldSuccessMessage(__out, __typeMapper);
      writeFieldTargetObject(__out, __typeMapper);
      writeFieldTargetParentField(__out, __typeMapper);
      writeFieldTargetRecordType(__out, __typeMapper);
      writeFieldType(__out, __typeMapper);
      writeFieldWidth(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCanvas(__in, __typeMapper);
      setDescription(__in, __typeMapper);
      setFlowDefinition(__in, __typeMapper);
      setHeight(__in, __typeMapper);
      setIcon(__in, __typeMapper);
      setIsProtected(__in, __typeMapper);
      setLabel(__in, __typeMapper);
      setLightningComponent(__in, __typeMapper);
      setOptionsCreateFeedItem(__in, __typeMapper);
      setPage(__in, __typeMapper);
      setQuickActionLayout(__in, __typeMapper);
      setStandardLabel(__in, __typeMapper);
      setSuccessMessage(__in, __typeMapper);
      setTargetObject(__in, __typeMapper);
      setTargetParentField(__in, __typeMapper);
      setTargetRecordType(__in, __typeMapper);
      setType(__in, __typeMapper);
      setWidth(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "canvas", canvas);
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "flowDefinition", flowDefinition);
      toStringHelper(sb, "height", height);
      toStringHelper(sb, "icon", icon);
      toStringHelper(sb, "isProtected", isProtected);
      toStringHelper(sb, "label", label);
      toStringHelper(sb, "lightningComponent", lightningComponent);
      toStringHelper(sb, "optionsCreateFeedItem", optionsCreateFeedItem);
      toStringHelper(sb, "page", page);
      toStringHelper(sb, "quickActionLayout", quickActionLayout);
      toStringHelper(sb, "standardLabel", standardLabel);
      toStringHelper(sb, "successMessage", successMessage);
      toStringHelper(sb, "targetObject", targetObject);
      toStringHelper(sb, "targetParentField", targetParentField);
      toStringHelper(sb, "targetRecordType", targetRecordType);
      toStringHelper(sb, "type", type);
      toStringHelper(sb, "width", width);
    }


}