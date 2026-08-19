package p479Td;

import kotlinx.serialization.descriptors.SerialDescriptor;
import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Td.b0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public abstract class AbstractC7343b0 {
    public static final C7364o Companion = new C7364o();

    /* JADX INFO: renamed from: b */
    public static final Object f23252b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C7363n.f23357Z);

    /* JADX INFO: renamed from: a */
    public final boolean f23253a;

    public /* synthetic */ AbstractC7343b0(int i10, boolean z6) {
        if ((i10 & 1) == 0) {
            this.f23253a = false;
        } else {
            this.f23253a = z6;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m7780b(AbstractC7343b0 abstractC7343b0, InterfaceC10429b interfaceC10429b, SerialDescriptor serialDescriptor) {
        if (interfaceC10429b.mo5565F(serialDescriptor) || abstractC7343b0.mo7777a()) {
            interfaceC10429b.mo5583q(serialDescriptor, 0, abstractC7343b0.mo7777a());
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo7777a() {
        return this.f23253a;
    }
}
