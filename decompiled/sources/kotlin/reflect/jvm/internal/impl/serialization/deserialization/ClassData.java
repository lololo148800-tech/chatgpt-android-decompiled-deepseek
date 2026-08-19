package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassData {

    /* JADX INFO: renamed from: a */
    public final NameResolver f52985a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Class f52986b;

    /* JADX INFO: renamed from: c */
    public final BinaryVersion f52987c;

    /* JADX INFO: renamed from: d */
    public final SourceElement f52988d;

    public ClassData(NameResolver nameResolver, ProtoBuf.Class classProto, BinaryVersion metadataVersion, SourceElement sourceElement) {
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(classProto, "classProto");
        AbstractC16544l.m18094g(metadataVersion, "metadataVersion");
        AbstractC16544l.m18094g(sourceElement, "sourceElement");
        this.f52985a = nameResolver;
        this.f52986b = classProto;
        this.f52987c = metadataVersion;
        this.f52988d = sourceElement;
    }

    public final NameResolver component1() {
        return this.f52985a;
    }

    public final ProtoBuf.Class component2() {
        return this.f52986b;
    }

    public final BinaryVersion component3() {
        return this.f52987c;
    }

    public final SourceElement component4() {
        return this.f52988d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return AbstractC16544l.m18089b(this.f52985a, classData.f52985a) && AbstractC16544l.m18089b(this.f52986b, classData.f52986b) && AbstractC16544l.m18089b(this.f52987c, classData.f52987c) && AbstractC16544l.m18089b(this.f52988d, classData.f52988d);
    }

    public int hashCode() {
        return this.f52988d.hashCode() + ((this.f52987c.hashCode() + ((this.f52986b.hashCode() + (this.f52985a.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f52985a + ", classProto=" + this.f52986b + ", metadataVersion=" + this.f52987c + ", sourceElement=" + this.f52988d + ')';
    }
}
