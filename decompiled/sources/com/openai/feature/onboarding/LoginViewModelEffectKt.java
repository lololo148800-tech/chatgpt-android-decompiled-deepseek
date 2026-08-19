package com.openai.feature.onboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p478Tc.AbstractC7308l;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p893n.AbstractActivityC17375g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18067d2 = {"onboarding_release"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class LoginViewModelEffectKt {
    /* JADX INFO: renamed from: a */
    public static final void m14322a(LoginViewModel viewModel, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(viewModel, "viewModel");
        c6021p.m6526U(1619375667);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(viewModel) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            c6021p.m6524S(1921002305);
            boolean zM6545h = ((i11 & 14) == 4) | c6021p.m6545h(abstractActivityC17375g) | c6021p.m6545h(c8870f);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new LoginViewModelEffectKt$LoginViewModelEffect$1$1(viewModel, abstractActivityC17375g, c8870f, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, viewModel);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new LoginViewModelEffectKt$LoginViewModelEffect$2(viewModel, i10);
        }
    }
}
