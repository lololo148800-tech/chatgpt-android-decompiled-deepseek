package p142Fc;

import gd.C13912Z0;
import gd.C13980q1;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p1081wc.C20879Z;
import p1081wc.C20881a0;
import p1081wc.InterfaceC20904w;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Fc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2708b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8338a = 0;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13849E f8339b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20904w f8340c;

    public C2708b(InterfaceC13849E experimentManager, C20879Z segmentAnalyticsService) {
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(segmentAnalyticsService, "segmentAnalyticsService");
        this.f8339b = experimentManager;
        this.f8340c = segmentAnalyticsService;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: a */
    public final Object m3702a(AbstractC19687c abstractC19687c) {
        C2707a c2707a;
        C20879Z c20879z;
        C2710d c2710d;
        C20881a0 c20881a0;
        switch (this.f8338a) {
            case 0:
                if (abstractC19687c instanceof C2707a) {
                    c2707a = (C2707a) abstractC19687c;
                    int i10 = c2707a.f8337p0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2707a.f8337p0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c2707a = new C2707a(this, abstractC19687c);
                    }
                } else {
                    c2707a = new C2707a(this, abstractC19687c);
                }
                Object objM15482b = c2707a.f8335Z;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c2707a.f8337p0;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(objM15482b);
                    C13912Z0 c13912z0 = C13912Z0.f43961c;
                    C20879Z c20879z2 = (C20879Z) this.f8340c;
                    c2707a.f8334Y = c20879z2;
                    c2707a.f8337p0 = 1;
                    objM15482b = ((C14005w2) this.f8339b).m15482b(c13912z0, c2707a);
                    if (objM15482b == enumC19250a) {
                        return enumC19250a;
                    }
                    c20879z = c20879z2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c20879z = c2707a.f8334Y;
                    AbstractC9233X.m9807c(objM15482b);
                }
                c20879z.m21450c(((Boolean) objM15482b).booleanValue());
                return C17296C.f55119a;
            default:
                if (abstractC19687c instanceof C2710d) {
                    c2710d = (C2710d) abstractC19687c;
                    int i12 = c2710d.f8347p0;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c2710d.f8347p0 = i12 - Integer.MIN_VALUE;
                    } else {
                        c2710d = new C2710d(this, abstractC19687c);
                    }
                } else {
                    c2710d = new C2710d(this, abstractC19687c);
                }
                Object objM15482b2 = c2710d.f8345Z;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c2710d.f8347p0;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(objM15482b2);
                    C13980q1 c13980q1 = C13980q1.f44038c;
                    C20881a0 c20881a1 = (C20881a0) this.f8340c;
                    c2710d.f8344Y = c20881a1;
                    c2710d.f8347p0 = 1;
                    objM15482b2 = ((C14005w2) this.f8339b).m15482b(c13980q1, c2710d);
                    if (objM15482b2 == enumC19250a2) {
                        return enumC19250a2;
                    }
                    c20881a0 = c20881a1;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c20881a0 = c2710d.f8344Y;
                    AbstractC9233X.m9807c(objM15482b2);
                }
                c20881a0.m21451c(((Boolean) objM15482b2).booleanValue());
                return C17296C.f55119a;
        }
    }

    public C2708b(InterfaceC13849E experimentManager, C20881a0 statsigAnalyticsService) {
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(statsigAnalyticsService, "statsigAnalyticsService");
        this.f8339b = experimentManager;
        this.f8340c = statsigAnalyticsService;
    }
}
