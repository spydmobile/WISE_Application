// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: projectGridFilter.proto

package ca.wise.project.proto;

public final class ProjectGridFilter {
  private ProjectGridFilter() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectWeatherGridFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectWeatherGridFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectPolyWeatherGridFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectPolyWeatherGridFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectAttributeGridFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectAttributeGridFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectReplaceGridFilterBase_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectReplaceGridFilterBase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectReplaceGridFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectReplaceGridFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectPolyReplaceGridFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectPolyReplaceGridFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectVectorFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectVectorFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WISE_ProjectProto_ProjectVectorFilter_VectorFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WISE_ProjectProto_ProjectVectorFilter_VectorFile_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027projectGridFilter.proto\022\021WISE.ProjectP" +
      "roto\032\nmath.proto\032\027weatherGridFilter.prot" +
      "o\032\021cwfgmFilter.proto\032\036google/protobuf/wr" +
      "appers.proto\"\205\001\n\030ProjectWeatherGridFilte" +
      "r\022\017\n\007version\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010comm" +
      "ents\030\003 \001(\t\0224\n\006filter\030\004 \001(\0132$.WISE.Weathe" +
      "rProto.WeatherGridFilter:\002\030\001\"\365\001\n\034Project" +
      "PolyWeatherGridFilter\022\017\n\007version\030\001 \001(\005\022\014" +
      "\n\004name\030\002 \001(\t\022\020\n\010comments\030\003 \001(\t\022+\n\005color\030" +
      "\004 \001(\0132\034.google.protobuf.UInt32Value\022*\n\004s" +
      "ize\030\005 \001(\0132\034.google.protobuf.UInt64Value\022" +
      "\021\n\tlandscape\030\006 \001(\010\0224\n\006filter\030\007 \001(\0132$.WIS" +
      "E.WeatherProto.WeatherGridFilter:\002\030\001\"\363\001\n" +
      "\032ProjectAttributeGridFilter\022\017\n\007version\030\001" +
      " \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010comments\030\003 \001(\t\022+\n\005" +
      "color\030\004 \001(\0132\034.google.protobuf.UInt32Valu" +
      "e\022*\n\004size\030\005 \001(\0132\034.google.protobuf.UInt64" +
      "Value\022\021\n\tlandscape\030\006 \001(\010\0224\n\006filter\030\007 \001(\013" +
      "2$.WISE.GridProto.CwfgmAttributeFilter:\002" +
      "\030\001\"\303\002\n\034ProjectReplaceGridFilterBase\022\017\n\007v" +
      "ersion\030\001 \001(\005\022\025\n\013toFuelIndex\030\002 \001(\005H\000\022\024\n\nt" +
      "oFuelName\030\003 \001(\tH\000\022\027\n\rfromFuelIndex\030\004 \001(\005" +
      "H\001\022\026\n\014fromFuelName\030\005 \001(\tH\001\022T\n\014fromFuelRu" +
      "le\030\006 \001(\0162<.WISE.ProjectProto.ProjectRepl" +
      "aceGridFilterBase.FromFuelRuleH\001\"D\n\014From" +
      "FuelRule\022\n\n\006NODATA\020\000\022\r\n\tALL_FUELS\020\001\022\031\n\025A" +
      "LL_COMBUSTIBLE_FUELS\020\002:\002\030\001B\010\n\006toFuelB\n\n\010" +
      "fromFuel\"\306\001\n\030ProjectReplaceGridFilter\022\017\n" +
      "\007version\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010comments" +
      "\030\003 \001(\t\0224\n\004area\030\004 \001(\0132&.WISE.GridProto.Cw" +
      "fgmReplaceGridFilter\022?\n\006filter\030\005 \001(\0132/.W" +
      "ISE.ProjectProto.ProjectReplaceGridFilte" +
      "rBase:\002\030\001\"\347\002\n\034ProjectPolyReplaceGridFilt" +
      "er\022\017\n\007version\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010com" +
      "ments\030\003 \001(\t\022+\n\005color\030\004 \001(\0132\034.google.prot" +
      "obuf.UInt32Value\022*\n\004size\030\005 \001(\0132\034.google." +
      "protobuf.UInt64Value\022=\n\007polygon\030\006 \001(\0132*." +
      "WISE.GridProto.CwfgmPolyReplaceGridFilte" +
      "rH\000\0220\n\010filename\030\007 \001(\0132\034.google.protobuf." +
      "StringValueH\000\022?\n\006filter\030\010 \001(\0132/.WISE.Pro" +
      "jectProto.ProjectReplaceGridFilterBase:\002" +
      "\030\001B\007\n\005shape\"\377\002\n\023ProjectVectorFilter\022\017\n\007v" +
      "ersion\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010comments\030\003" +
      " \001(\t\022\r\n\005color\030\004 \001(\r\022\021\n\tfillColor\030\005 \001(\r\022\016" +
      "\n\006symbol\030\006 \001(\r\022\r\n\005width\030\007 \001(\021\022\020\n\010importe" +
      "d\030\010 \001(\010\0223\n\006filter\030\t \001(\0132!.WISE.GridProto" +
      ".CwfgmVectorFilterH\000\022\026\n\010filename\030\n \001(\tB\002" +
      "\030\001H\000\022A\n\004file\030\013 \001(\01321.WISE.ProjectProto.P" +
      "rojectVectorFilter.VectorFileH\000\032H\n\nVecto" +
      "rFile\022\020\n\010filename\030\001 \001(\t\022$\n\016fireBreakWidt" +
      "h\030\002 \001(\0132\014.Math.Double:\002\030\001:\002\030\001B\006\n\004dataB-\n" +
      "\025ca.wise.project.protoP\001\252\002\021WISE.ProjectP" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ca.hss.math.proto.Math.getDescriptor(),
          ca.wise.weather.proto.WeatherGridFilterOuterClass.getDescriptor(),
          ca.wise.grid.proto.CwfgmFilter.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_WISE_ProjectProto_ProjectWeatherGridFilter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WISE_ProjectProto_ProjectWeatherGridFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectWeatherGridFilter_descriptor,
        new java.lang.String[] { "Version", "Name", "Comments", "Filter", });
    internal_static_WISE_ProjectProto_ProjectPolyWeatherGridFilter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_WISE_ProjectProto_ProjectPolyWeatherGridFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectPolyWeatherGridFilter_descriptor,
        new java.lang.String[] { "Version", "Name", "Comments", "Color", "Size", "Landscape", "Filter", });
    internal_static_WISE_ProjectProto_ProjectAttributeGridFilter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_WISE_ProjectProto_ProjectAttributeGridFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectAttributeGridFilter_descriptor,
        new java.lang.String[] { "Version", "Name", "Comments", "Color", "Size", "Landscape", "Filter", });
    internal_static_WISE_ProjectProto_ProjectReplaceGridFilterBase_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_WISE_ProjectProto_ProjectReplaceGridFilterBase_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectReplaceGridFilterBase_descriptor,
        new java.lang.String[] { "Version", "ToFuelIndex", "ToFuelName", "FromFuelIndex", "FromFuelName", "FromFuelRule", "ToFuel", "FromFuel", });
    internal_static_WISE_ProjectProto_ProjectReplaceGridFilter_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_WISE_ProjectProto_ProjectReplaceGridFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectReplaceGridFilter_descriptor,
        new java.lang.String[] { "Version", "Name", "Comments", "Area", "Filter", });
    internal_static_WISE_ProjectProto_ProjectPolyReplaceGridFilter_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_WISE_ProjectProto_ProjectPolyReplaceGridFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectPolyReplaceGridFilter_descriptor,
        new java.lang.String[] { "Version", "Name", "Comments", "Color", "Size", "Polygon", "Filename", "Filter", "Shape", });
    internal_static_WISE_ProjectProto_ProjectVectorFilter_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_WISE_ProjectProto_ProjectVectorFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectVectorFilter_descriptor,
        new java.lang.String[] { "Version", "Name", "Comments", "Color", "FillColor", "Symbol", "Width", "Imported", "Filter", "Filename", "File", "Data", });
    internal_static_WISE_ProjectProto_ProjectVectorFilter_VectorFile_descriptor =
      internal_static_WISE_ProjectProto_ProjectVectorFilter_descriptor.getNestedTypes().get(0);
    internal_static_WISE_ProjectProto_ProjectVectorFilter_VectorFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WISE_ProjectProto_ProjectVectorFilter_VectorFile_descriptor,
        new java.lang.String[] { "Filename", "FireBreakWidth", });
    ca.hss.math.proto.Math.getDescriptor();
    ca.wise.weather.proto.WeatherGridFilterOuterClass.getDescriptor();
    ca.wise.grid.proto.CwfgmFilter.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
