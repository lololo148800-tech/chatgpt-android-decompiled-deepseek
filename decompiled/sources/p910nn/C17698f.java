package p910nn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16533a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: nn.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C17698f extends C16533a implements InterfaceC1436k {
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ProtoBuf.Type p10 = (ProtoBuf.Type) obj;
        AbstractC16544l.m18094g(p10, "p0");
        return TypeDeserializer.simpleType$default((TypeDeserializer) this.f51270Y, p10, false, 2, null);
    }
}
