package p202I;

import p283L5.AbstractC4941g;
import p301M.RunnableC5220b;
import p544W9.AbstractC8488H2;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p610Z1.InterfaceC10143j;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: I.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3537m {

    /* JADX INFO: renamed from: a */
    public final C3530f f10702a;

    /* JADX INFO: renamed from: b */
    public final C3539o f10703b;

    /* JADX INFO: renamed from: c */
    public final C10145l f10704c;

    /* JADX INFO: renamed from: d */
    public final C10145l f10705d;

    /* JADX INFO: renamed from: e */
    public C10142i f10706e;

    /* JADX INFO: renamed from: f */
    public C10142i f10707f;

    /* JADX INFO: renamed from: g */
    public boolean f10708g = false;

    /* JADX INFO: renamed from: h */
    public boolean f10709h = false;

    /* JADX INFO: renamed from: i */
    public RunnableC5220b f10710i;

    public C3537m(C3530f c3530f, C3539o c3539o) {
        this.f10702a = c3530f;
        this.f10703b = c3539o;
        final int i10 = 0;
        this.f10704c = AbstractC16347a.m17947b(new InterfaceC10143j(this) { // from class: I.l

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C3537m f10701Z;

            {
                this.f10701Z = this;
            }

            @Override // p610Z1.InterfaceC10143j
            /* JADX INFO: renamed from: b */
            public final Object mo169b(C10142i c10142i) {
                switch (i10) {
                    case 0:
                        this.f10701Z.f10706e = c10142i;
                        return "CaptureCompleteFuture";
                    default:
                        this.f10701Z.f10707f = c10142i;
                        return "RequestCompleteFuture";
                }
            }
        });
        final int i11 = 1;
        this.f10705d = AbstractC16347a.m17947b(new InterfaceC10143j(this) { // from class: I.l

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C3537m f10701Z;

            {
                this.f10701Z = this;
            }

            @Override // p610Z1.InterfaceC10143j
            /* JADX INFO: renamed from: b */
            public final Object mo169b(C10142i c10142i) {
                switch (i11) {
                    case 0:
                        this.f10701Z.f10706e = c10142i;
                        return "CaptureCompleteFuture";
                    default:
                        this.f10701Z.f10707f = c10142i;
                        return "RequestCompleteFuture";
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m4219a() {
        AbstractC4941g.m5559R("The callback can only complete once.", !this.f10705d.f30070Z.isDone());
        this.f10707f.m10747a(null);
    }

    /* JADX INFO: renamed from: b */
    public final void m4220b() {
        AbstractC8488H2.m9140a();
        if (this.f10708g || this.f10709h) {
            return;
        }
        this.f10709h = true;
    }
}
