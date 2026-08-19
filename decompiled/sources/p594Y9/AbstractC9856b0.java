package p594Y9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0233b1;
import p049Bm.InterfaceC1436k;
import p050Bn.C1450d;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p228J.AbstractC3794B0;
import p349O0.AbstractC6012k0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p385Pj.C6427b;
import p474T8.C7266d;
import p474T8.C7268f;
import p474T8.C7271i;
import p474T8.C7277o;
import p474T8.InterfaceC7269g;
import p478Tc.AbstractC7308l;
import p507Uh.C7684j;
import p507Uh.C7685k;
import p507Uh.C7686l;
import p507Uh.C7687m;
import p507Uh.C7689o;
import p507Uh.InterfaceC7678d;
import p544W9.AbstractC8571V2;
import p571X9.AbstractC9196Q3;
import p795i.C14893g;
import p893n.AbstractActivityC17375g;
import p919o8.C17999p0;

/* JADX INFO: renamed from: Y9.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9856b0 {
    /* JADX INFO: renamed from: a */
    public static C17999p0 m10506a(C3676s c3676s) {
        try {
            Number sessionSampleRate = c3676s.m4395w("session_sample_rate").mo4383q();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("session_replay_sample_rate");
            Number numberMo4383q = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4383q() : null;
            AbstractC16544l.m18093f(sessionSampleRate, "sessionSampleRate");
            return new C17999p0(sessionSampleRate, numberMo4383q);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Configuration", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Configuration", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Configuration", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C7687m m10507b(C6021p c6021p) {
        c6021p.m6524S(-1880887848);
        c6021p.m6524S(-1303236470);
        Object objM6514H = c6021p.m6514H();
        if (objM6514H == C6013l.f19514a) {
            objM6514H = new C7687m();
            c6021p.m6537c0(objM6514H);
        }
        C7687m c7687m = (C7687m) objM6514H;
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        return c7687m;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC7678d m10508c(String str, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10, int i11) {
        InterfaceC7269g c7277o;
        c6021p.m6524S(1666259729);
        if ((i11 & 2) != 0) {
            interfaceC1436k = C7684j.f24222o0;
        }
        AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
        c6021p.m6524S(-1535258128);
        AbstractC6012k0 abstractC6012k0 = AbstractC0233b1.f873a;
        boolean zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k0)).booleanValue();
        Object obj = C6013l.f19514a;
        if (zBooleanValue) {
            c6021p.m6524S(-1535256584);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == obj) {
                objM6514H = AbstractC9836Y.m10482a(new C7685k(str), new C7686l(), abstractActivityC17375g);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC7678d interfaceC7678d = (InterfaceC7678d) objM6514H;
            AbstractC3794B0.m4471F(c6021p, false, false, false);
            return interfaceC7678d;
        }
        c6021p.m6553p(false);
        C7271i c7271i = C7271i.f23054a;
        c6021p.m6524S(923020361);
        int i12 = (i10 & 112) | (i10 & 14) | 384;
        c6021p.m6524S(-1732095526);
        if (((Boolean) c6021p.m6548k(abstractC6012k0)).booleanValue()) {
            c7277o = new C7277o(str, c7271i);
        } else {
            c6021p.m6524S(1424240517);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            c6021p.m6524S(1134374053);
            boolean z6 = true;
            boolean z10 = (((i12 & 14) ^ 6) > 4 && c6021p.m6542f(str)) || (i12 & 6) == 4;
            Object objM6514H2 = c6021p.m6514H();
            if (z10 || objM6514H2 == obj) {
                objM6514H2 = new C7268f(str, context, AbstractC9196Q3.m9761c(context));
                c6021p.m6537c0(objM6514H2);
            }
            C7268f c7268f = (C7268f) objM6514H2;
            c6021p.m6553p(false);
            AbstractC9196Q3.m9759a(c7268f, null, c6021p, 0);
            C6427b c6427b = new C6427b(6);
            c6021p.m6524S(1134386901);
            boolean zM6542f = c6021p.m6542f(c7268f);
            if ((((i12 & 112) ^ 48) <= 32 || !c6021p.m6542f(interfaceC1436k)) && (i12 & 48) != 32) {
                z6 = false;
            }
            boolean z11 = zM6542f | z6;
            Object objM6514H3 = c6021p.m6514H();
            if (z11 || objM6514H3 == obj) {
                objM6514H3 = new C1450d(c7268f, 5, interfaceC1436k);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C14893g c14893gM9235b = AbstractC8571V2.m9235b(c6427b, (InterfaceC1436k) objM6514H3, c6021p, 0);
            c6021p.m6524S(1134391322);
            boolean zM6542f2 = c6021p.m6542f(c7268f) | c6021p.m6545h(c14893gM9235b);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == obj) {
                objM6514H4 = new C7266d(c7268f, c14893gM9235b, 1);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            C5997d.m6446d(c7268f, c14893gM9235b, (InterfaceC1436k) objM6514H4, c6021p);
            c6021p.m6553p(false);
            c7277o = c7268f;
        }
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        C7689o c7689oM10518b = AbstractC9863c0.m10518b(c6021p);
        Object objMo7726a = c7277o.mo7726a();
        c6021p.m6524S(-1535247563);
        boolean zM6542f3 = c6021p.m6542f(objMo7726a) | c6021p.m6542f(abstractActivityC17375g) | c6021p.m6542f(c7277o) | c6021p.m6542f(c7689oM10518b);
        Object objM6514H5 = c6021p.m6514H();
        if (zM6542f3 || objM6514H5 == obj) {
            objM6514H5 = AbstractC9836Y.m10482a(c7277o, c7689oM10518b, abstractActivityC17375g);
            c6021p.m6537c0(objM6514H5);
        }
        InterfaceC7678d interfaceC7678d2 = (InterfaceC7678d) objM6514H5;
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        return interfaceC7678d2;
    }
}
