// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetCollection.proto

package ca.wise.project.proto;

public final class AssetCollectionOuterClass {
  private AssetCollectionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectAsset_VectorFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectAsset_VectorFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectTarget_TargetFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectTarget_TargetFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_AssetCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_AssetCollection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_TargetCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_TargetCollection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025assetCollection.proto\022\021WISE.ProjectPro" +
      "to\032\nmath.proto\032\027projectGridFilter.proto\032" +
      "\021cwfgmFilter.proto\"\315\002\n\014ProjectAsset\022\017\n\007v" +
      "ersion\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010comments\030\003" +
      " \001(\t\022\r\n\005color\030\004 \001(\r\022\021\n\tfillColor\030\005 \001(\r\022\016" +
      "\n\006symbol\030\006 \001(\r\022\r\n\005width\030\007 \001(\021\022\020\n\010importe" +
      "d\030\010 \001(\010\022,\n\006filter\030\t \001(\0132\032.WISE.GridProto" +
      ".CwfgmAssetH\000\022:\n\004file\030\n \001(\0132*.WISE.Proje" +
      "ctProto.ProjectAsset.VectorFileH\000\032C\n\nVec" +
      "torFile\022\020\n\010filename\030\001 \001(\t\022#\n\rassetBounda" +
      "ry\030\002 \001(\0132\014.Math.Double:\002\030\001B\006\n\004data\"\236\002\n\rP" +
      "rojectTarget\022\017\n\007version\030\001 \001(\005\022\014\n\004name\030\002 " +
      "\001(\t\022\020\n\010comments\030\003 \001(\t\022\r\n\005color\030\004 \001(\r\022\016\n\006" +
      "symbol\030\005 \001(\r\022\023\n\013displaySize\030\006 \001(\021\022\020\n\010imp" +
      "orted\030\007 \001(\010\022-\n\006filter\030\010 \001(\0132\033.WISE.GridP" +
      "roto.CwfgmTargetH\000\022;\n\004file\030\t \001(\0132+.WISE." +
      "ProjectProto.ProjectTarget.TargetFileH\000\032" +
      "\036\n\nTargetFile\022\020\n\010filename\030\001 \001(\t:\002\030\001B\006\n\004d" +
      "ata\"\211\001\n\017AssetCollection\022\017\n\007version\030\001 \001(\005" +
      "\0223\n\006assets\030\002 \003(\0132\037.WISE.ProjectProto.Pro" +
      "jectAssetB\002\030\001\0220\n\014valuesAtRisk\030\003 \003(\0132\032.WI" +
      "SE.GridProto.CwfgmAsset\"\213\001\n\020TargetCollec" +
      "tion\022\017\n\007version\030\001 \001(\005\0225\n\007targets\030\002 \003(\0132 " +
      ".WISE.ProjectProto.ProjectTargetB\002\030\001\022/\n\n" +
      "targetData\030\003 \003(\0132\033.WISE.GridProto.CwfgmT" +
      "argetB-\n\025ca.wise.project.protoP\001\252\002\021WISE." +
      "ProjectProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ca.hss.math.proto.Math.getDescriptor(),
          ca.wise.project.proto.ProjectGridFilter.getDescriptor(),
          ca.wise.grid.proto.CwfgmFilter.getDescriptor(),
        });
    internal_static_WISE_ProjectProto_ProjectAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WISE_ProjectProto_ProjectAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectAsset_descriptor,
        new java.lang.String[] { "Version", "Name", "Comments", "Color", "FillColor", "Symbol", "Width", "Imported", "Filter", "File", "Data", });
    internal_static_WISE_ProjectProto_ProjectAsset_VectorFile_descriptor =
      internal_static_WISE_ProjectProto_ProjectAsset_descriptor.getNestedTypes().get(0);
    internal_static_WISE_ProjectProto_ProjectAsset_VectorFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectAsset_VectorFile_descriptor,
        new java.lang.String[] { "Filename", "AssetBoundary", });
    internal_static_WISE_ProjectProto_ProjectTarget_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_WISE_ProjectProto_ProjectTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectTarget_descriptor,
        new java.lang.String[] { "Version", "Name", "Comments", "Color", "Symbol", "DisplaySize", "Imported", "Filter", "File", "Data", });
    internal_static_WISE_ProjectProto_ProjectTarget_TargetFile_descriptor =
      internal_static_WISE_ProjectProto_ProjectTarget_descriptor.getNestedTypes().get(0);
    internal_static_WISE_ProjectProto_ProjectTarget_TargetFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectTarget_TargetFile_descriptor,
        new java.lang.String[] { "Filename", });
    internal_static_WISE_ProjectProto_AssetCollection_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_WISE_ProjectProto_AssetCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_AssetCollection_descriptor,
        new java.lang.String[] { "Version", "Assets", "ValuesAtRisk", });
    internal_static_WISE_ProjectProto_TargetCollection_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_WISE_ProjectProto_TargetCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_TargetCollection_descriptor,
        new java.lang.String[] { "Version", "Targets", "TargetData", });
    ca.hss.math.proto.Math.getDescriptor();
    ca.wise.project.proto.ProjectGridFilter.getDescriptor();
    ca.wise.grid.proto.CwfgmFilter.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
