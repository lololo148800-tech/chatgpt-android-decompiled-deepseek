package p298Lm;

import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: Lm.Z */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5163Z extends AbstractC16541i implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C5163Z f16820Y = new C5163Z(2, MemberDeserializer.class, "loadProperty", "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        MemberDeserializer p10 = (MemberDeserializer) obj;
        ProtoBuf.Property p11 = (ProtoBuf.Property) obj2;
        AbstractC16544l.m18094g(p10, "p0");
        AbstractC16544l.m18094g(p11, "p1");
        return p10.loadProperty(p11);
    }
}
