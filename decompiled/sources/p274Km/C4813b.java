package p274Km;

import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: Km.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4813b extends AbstractC16541i implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C4813b f15693Y = new C4813b(2, MemberDeserializer.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        MemberDeserializer p10 = (MemberDeserializer) obj;
        ProtoBuf.Function p11 = (ProtoBuf.Function) obj2;
        AbstractC16544l.m18094g(p10, "p0");
        AbstractC16544l.m18094g(p11, "p1");
        return p10.loadFunction(p11);
    }
}
