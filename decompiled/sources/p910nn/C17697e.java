package p910nn;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p007A5.C0372g;
import p298Lm.C5140G;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: nn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C17697e {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f56495a;

    /* JADX INFO: renamed from: b */
    public final MemoizedFunctionToNullable f56496b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue f56497c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DeserializedClassDescriptor f56498d;

    public C17697e(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f56498d = deserializedClassDescriptor;
        List<ProtoBuf.EnumEntry> enumEntryList = deserializedClassDescriptor.getClassProto().getEnumEntryList();
        AbstractC16544l.m18093f(enumEntryList, "getEnumEntryList(...)");
        List<ProtoBuf.EnumEntry> list = enumEntryList;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b < 16 ? 16 : iM19257b);
        for (Object obj : list) {
            linkedHashMap.put(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.EnumEntry) obj).getName()), obj);
        }
        this.f56495a = linkedHashMap;
        this.f56496b = this.f56498d.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new C0372g(this, 9, this.f56498d));
        this.f56497c = this.f56498d.getC().getStorageManager().createLazyValue(new C5140G(this, 27));
    }
}
