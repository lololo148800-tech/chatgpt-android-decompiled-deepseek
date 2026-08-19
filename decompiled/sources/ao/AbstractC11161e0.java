package ao;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.e0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11161e0 extends AbstractC11186r {

    /* JADX INFO: renamed from: b */
    public final C11159d0 f33800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC11161e0(KSerializer primitiveSerializer) {
        super(primitiveSerializer);
        AbstractC16544l.m18094g(primitiveSerializer, "primitiveSerializer");
        this.f33800b = new C11159d0(primitiveSerializer.getDescriptor());
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: a */
    public final Object mo12366a() {
        return (AbstractC11157c0) mo12363g(mo12364j());
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: b */
    public final int mo12367b(Object obj) {
        AbstractC11157c0 abstractC11157c0 = (AbstractC11157c0) obj;
        AbstractC16544l.m18094g(abstractC11157c0, "<this>");
        return abstractC11157c0.mo12372d();
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: c */
    public final Iterator mo12368c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // ao.AbstractC11152a, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return m12377e(decoder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f33800b;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: h */
    public final Object mo12369h(Object obj) {
        AbstractC11157c0 abstractC11157c0 = (AbstractC11157c0) obj;
        AbstractC16544l.m18094g(abstractC11157c0, "<this>");
        return abstractC11157c0.mo12370a();
    }

    @Override // ao.AbstractC11186r
    /* JADX INFO: renamed from: i */
    public final void mo12392i(Object obj, int i10, Object obj2) {
        AbstractC16544l.m18094g((AbstractC11157c0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo12364j();

    /* JADX INFO: renamed from: k */
    public abstract void mo12365k(InterfaceC10429b interfaceC10429b, Object obj, int i10);

    @Override // ao.AbstractC11186r, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC16544l.m18094g(encoder, "encoder");
        int iMo12361d = mo12361d(obj);
        C11159d0 c11159d0 = this.f33800b;
        InterfaceC10429b interfaceC10429bMo5587u = encoder.mo5587u(c11159d0, iMo12361d);
        mo12365k(interfaceC10429bMo5587u, obj, iMo12361d);
        interfaceC10429bMo5587u.mo5569b(c11159d0);
    }
}
