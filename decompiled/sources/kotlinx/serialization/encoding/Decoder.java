package kotlinx.serialization.encoding;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p001A.C0042V0;
import p631Zn.InterfaceC10428a;

/* JADX INFO: loaded from: classes2.dex */
public interface Decoder {
    /* JADX INFO: renamed from: A */
    byte mo5463A();

    /* JADX INFO: renamed from: B */
    short mo5464B();

    /* JADX INFO: renamed from: C */
    float mo5465C();

    /* JADX INFO: renamed from: D */
    Object mo5466D();

    /* JADX INFO: renamed from: F */
    double mo5468F();

    /* JADX INFO: renamed from: a */
    C0042V0 mo10913a();

    /* JADX INFO: renamed from: c */
    InterfaceC10428a mo5471c(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: e */
    boolean mo5472e();

    /* JADX INFO: renamed from: f */
    char mo5473f();

    /* JADX INFO: renamed from: h */
    int mo5475h(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: k */
    int mo5477k();

    /* JADX INFO: renamed from: m */
    String mo5479m();

    /* JADX INFO: renamed from: n */
    long mo5480n();

    /* JADX INFO: renamed from: p */
    Object mo5482p(KSerializer kSerializer);

    /* JADX INFO: renamed from: r */
    boolean mo5484r();

    /* JADX INFO: renamed from: v */
    Decoder mo5487v(SerialDescriptor serialDescriptor);
}
