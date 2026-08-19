package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeTable {

    /* JADX INFO: renamed from: a */
    public final List f52584a;

    public TypeTable(ProtoBuf.TypeTable typeTable) {
        AbstractC16544l.m18094g(typeTable, "typeTable");
        List<ProtoBuf.Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List<ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            AbstractC16544l.m18093f(typeList2, "getTypeList(...)");
            List<ProtoBuf.Type> list = typeList2;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                ProtoBuf.Type typeBuild = (ProtoBuf.Type) obj;
                if (i10 >= firstNullable) {
                    typeBuild = typeBuild.toBuilder().setNullable(true).build();
                }
                arrayList.add(typeBuild);
                i10 = i11;
            }
            typeList = arrayList;
        }
        AbstractC16544l.m18093f(typeList, "run(...)");
        this.f52584a = typeList;
    }

    public final ProtoBuf.Type get(int i10) {
        return (ProtoBuf.Type) this.f52584a.get(i10);
    }
}
