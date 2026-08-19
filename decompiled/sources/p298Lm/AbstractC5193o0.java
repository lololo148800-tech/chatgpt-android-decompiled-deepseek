package p298Lm;

import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import p225Im.InterfaceC3759g;
import p225Im.InterfaceC3768p;
import p323Mm.InterfaceC5500g;

/* JADX INFO: renamed from: Lm.o0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5193o0 extends AbstractC5202t implements InterfaceC3759g, InterfaceC3768p {
    @Override // p225Im.InterfaceC3759g
    public final boolean isExternal() {
        return mo5752q().isExternal();
    }

    @Override // p225Im.InterfaceC3759g
    public final boolean isInfix() {
        return mo5752q().isInfix();
    }

    @Override // p225Im.InterfaceC3759g
    public final boolean isInline() {
        return mo5752q().isInline();
    }

    @Override // p225Im.InterfaceC3759g
    public final boolean isOperator() {
        return mo5752q().isOperator();
    }

    @Override // p225Im.InterfaceC3755c
    public final boolean isSuspend() {
        return mo5752q().isSuspend();
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: k */
    public final AbstractC5148K mo5736k() {
        return mo5743r().f16910s0;
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: l */
    public final InterfaceC5500g mo5737l() {
        return null;
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: p */
    public final boolean mo5739p() {
        return mo5743r().mo5739p();
    }

    /* JADX INFO: renamed from: q */
    public abstract PropertyAccessorDescriptor mo5752q();

    /* JADX INFO: renamed from: r */
    public abstract AbstractC5203t0 mo5743r();
}
