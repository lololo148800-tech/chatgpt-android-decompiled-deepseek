package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p909nm.AbstractC17680n;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmNameResolver extends JvmNameResolverBase {
    /* JADX WARN: Illegal instructions before constructor call */
    public JvmNameResolver(JvmProtoBuf.StringTableTypes types, String[] strings) {
        AbstractC16544l.m18094g(types, "types");
        AbstractC16544l.m18094g(strings, "strings");
        List<Integer> localNameList = types.getLocalNameList();
        Set setM19328G0 = localNameList.isEmpty() ? C17691y.f56482Y : AbstractC17680n.m19328G0(localNameList);
        List<JvmProtoBuf.StringTableTypes.Record> recordList = types.getRecordList();
        AbstractC16544l.m18093f(recordList, "getRecordList(...)");
        super(strings, setM19328G0, JvmNameResolverKt.toExpandedRecordsList(recordList));
    }
}
