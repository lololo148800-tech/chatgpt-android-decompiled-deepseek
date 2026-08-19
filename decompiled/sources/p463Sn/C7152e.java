package p463Sn;

import ao.AbstractC11154b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import mm.EnumC17307j;
import p225Im.InterfaceC3756d;
import p324Mn.AbstractC5546p;
import p559Wn.C8974f;
import p571X9.AbstractC9227W;
import p631Zn.InterfaceC10428a;

/* JADX INFO: renamed from: Sn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C7152e extends AbstractC11154b {

    /* JADX INFO: renamed from: a */
    public static final C7152e f22744a = new C7152e();

    /* JADX INFO: renamed from: b */
    public static final Object f22745b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C7148a.f22733o0);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // ao.AbstractC11154b
    /* JADX INFO: renamed from: a */
    public final KSerializer mo7537a(InterfaceC10428a interfaceC10428a, String str) {
        return ((C8974f) f22745b.getValue()).mo7537a(interfaceC10428a, str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mm.i] */
    @Override // ao.AbstractC11154b
    /* JADX INFO: renamed from: b */
    public final KSerializer mo7538b(Encoder encoder, Object obj) {
        AbstractC5546p value = (AbstractC5546p) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        return ((C8974f) f22745b.getValue()).mo7538b(encoder, value);
    }

    @Override // ao.AbstractC11154b
    /* JADX INFO: renamed from: c */
    public final InterfaceC3756d mo7539c() {
        return AbstractC16526C.f51263a.mo5693b(AbstractC5546p.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return ((C8974f) f22745b.getValue()).getDescriptor();
    }
}
