package p530Vi;

import bo.C11527o;
import com.segment.analytics.kotlin.core.Settings;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.AbstractC0010F;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1113xn.C21307a;
import p292Lg.C5034f;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC7958O5;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9758K4;
import p594Y9.AbstractC9852a3;
import p594Y9.AbstractC9961r4;
import p646aj.AbstractC10628h;
import p658b5.C11241l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vi.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C8326v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f25958Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8312h f25959Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f25960o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f25961p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8326v(C8312h c8312h, String str, String str2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f25959Z = c8312h;
        this.f25960o0 = str;
        this.f25961p0 = str2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8326v(this.f25959Z, this.f25960o0, this.f25961p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8326v) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Settings settings;
        String strM8249b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f25958Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            String str = "Fetching settings on " + Thread.currentThread().getName();
            C8312h c8312h = this.f25959Z;
            AbstractC9758K4.m10361b(c8312h, str);
            C8317m c8317m = c8312h.f25902Y;
            String writeKey = this.f25960o0;
            AbstractC16544l.m18094g(writeKey, "writeKey");
            String cdnHost = this.f25961p0;
            AbstractC16544l.m18094g(cdnHost, "cdnHost");
            try {
                InputStream inputStream = new C11241l(writeKey, c8317m.f25929o).m12590K(cdnHost).f25943Z;
                if (inputStream != null) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C21307a.f67720a), 8192);
                    try {
                        strM8249b = AbstractC7958O5.m8249b(bufferedReader);
                        AbstractC7942M5.m8232a(bufferedReader, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            AbstractC7942M5.m8232a(bufferedReader, th2);
                            throw th3;
                        }
                    }
                } else {
                    strM8249b = "";
                }
                AbstractC9758K4.m10361b(c8312h, "Fetched Settings: ".concat(strM8249b));
                C11527o c11527o = AbstractC10628h.f31540b;
                c11527o.getClass();
                settings = (Settings) c11527o.m12903b(strM8249b, AbstractC9961r4.m10615b(Settings.INSTANCE.serializer()));
            } catch (Exception e10) {
                AbstractC9852a3.m10501b(c8312h, new C8314j(new C8313i(new URL(AbstractC0010F.m20d("https://", cdnHost, "/projects/", writeKey, "/settings")), e10)), "Failed to fetch settings", "analytics_mobile.invoke.error", AbstractC9221V.m9790b(e10), new C5034f(e10, 29, writeKey));
                settings = c8317m.f25925k;
            }
            C0611f0 c0611f0 = (C0611f0) c8312h.f25903Z.f7438p0;
            C8325u c8325u = new C8325u(settings, c8312h, null);
            this.f25958Y = 1;
            if (AbstractC0575H.m1168P(c0611f0, c8325u, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
