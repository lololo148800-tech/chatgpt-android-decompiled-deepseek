package p425Ra;

import p572Xa.AbstractRunnableC9428v;
import p572Xa.C9409c;
import p746fa.C13599h;

/* JADX INFO: renamed from: Ra.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6835h extends AbstractRunnableC9428v {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6836i f21927Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6835h(C6836i c6836i, C13599h c13599h) {
        super(c13599h);
        this.f21927Z = c6836i;
    }

    @Override // p572Xa.AbstractRunnableC9428v
    /* JADX INFO: renamed from: a */
    public final void mo7276a(Exception exc) {
        if (!(exc instanceof C9409c)) {
            super.mo7276a(exc);
        } else if (C6836i.m7280d(this.f21927Z)) {
            super.mo7276a(new C6828a(-2, exc));
        } else {
            super.mo7276a(new C6828a(-9, exc));
        }
    }
}
