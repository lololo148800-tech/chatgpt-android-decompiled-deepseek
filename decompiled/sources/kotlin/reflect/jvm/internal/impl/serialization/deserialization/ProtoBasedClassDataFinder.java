package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a */
    public final NameResolver f53040a;

    /* JADX INFO: renamed from: b */
    public final BinaryVersion f53041b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k f53042c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f53043d;

    public ProtoBasedClassDataFinder(ProtoBuf.PackageFragment proto, NameResolver nameResolver, BinaryVersion metadataVersion, InterfaceC1436k classSource) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(metadataVersion, "metadataVersion");
        AbstractC16544l.m18094g(classSource, "classSource");
        this.f53040a = nameResolver;
        this.f53041b = metadataVersion;
        this.f53042c = classSource;
        List<ProtoBuf.Class> class_List = proto.getClass_List();
        AbstractC16544l.m18093f(class_List, "getClass_List(...)");
        List<ProtoBuf.Class> list = class_List;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b < 16 ? 16 : iM19257b);
        for (Object obj : list) {
            linkedHashMap.put(NameResolverUtilKt.getClassId(this.f53040a, ((ProtoBuf.Class) obj).getFqName()), obj);
        }
        this.f53043d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData findClassData(ClassId classId) {
        AbstractC16544l.m18094g(classId, "classId");
        ProtoBuf.Class r6 = (ProtoBuf.Class) this.f53043d.get(classId);
        if (r6 == null) {
            return null;
        }
        return new ClassData(this.f53040a, r6, this.f53041b, (SourceElement) this.f53042c.invoke(classId));
    }

    public final Collection<ClassId> getAllClassIds() {
        return this.f53043d.keySet();
    }
}
