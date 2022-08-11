package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.demo.dagger2demo_kotlin.DataBinderMapperImpl());
  }
}
