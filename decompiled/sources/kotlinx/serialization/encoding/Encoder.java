package kotlinx.serialization.encoding;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p001A.C0042V0;
import p631Zn.InterfaceC10429b;

/* JADX INFO: loaded from: classes2.dex */
public interface Encoder {
    /* JADX INFO: renamed from: A */
    void mo5560A(KSerializer kSerializer, Object obj);

    /* JADX INFO: renamed from: C */
    void mo5562C(long j10);

    /* JADX INFO: renamed from: G */
    void mo5566G(String str);

    /* JADX INFO: renamed from: a */
    C0042V0 mo13069a();

    /* JADX INFO: renamed from: c */
    InterfaceC10429b mo5570c(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: e */
    void mo5571e(Boolean bool);

    /* JADX INFO: renamed from: f */
    void mo5572f();

    /* JADX INFO: renamed from: g */
    void mo5573g(double d10);

    /* JADX INFO: renamed from: h */
    void mo5574h(short s10);

    /* JADX INFO: renamed from: j */
    void mo5576j(byte b);

    /* JADX INFO: renamed from: k */
    void mo5577k(boolean z6);

    /* JADX INFO: renamed from: n */
    void mo5580n(float f10);

    /* JADX INFO: renamed from: p */
    void mo5582p(char c9);

    /* JADX INFO: renamed from: u */
    InterfaceC10429b mo5587u(SerialDescriptor serialDescriptor, int i10);

    /* JADX INFO: renamed from: v */
    void mo5588v(SerialDescriptor serialDescriptor, int i10);

    /* JADX INFO: renamed from: x */
    void mo5589x(int i10);

    /* JADX INFO: renamed from: y */
    Encoder mo5590y(SerialDescriptor serialDescriptor);
}
