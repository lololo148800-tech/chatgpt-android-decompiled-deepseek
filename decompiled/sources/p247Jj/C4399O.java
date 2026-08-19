package p247Jj;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC11002c;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.ViewModelLazy;
import cn.UfGr.EhBykzn;
import com.withpersona.sdk2.inquiry.LocalStaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.network.NetworkModule;
import io.sentry.clientreport.C15333a;
import io.sentry.hints.C15370i;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import mm.C17314q;
import mm.EnumC17307j;
import mm.InterfaceC17306i;
import p009A7.C0392b;
import p022Ak.EnumC0543d;
import p025An.AbstractC0575H;
import p1009s9.C19506i;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2149O0;
import p105E.C2222a;
import p1109xj.C21277a;
import p110E4.C2307e;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1131yj.InterfaceC21546a;
import p167Gb.C3032c;
import p197Hj.C3457c;
import p295Lj.AbstractC5103c;
import p295Lj.C5102b;
import p320Mj.C5449b;
import p320Mj.C5450c;
import p320Mj.C5461n;
import p477Tb.C7296c;
import p523V9.AbstractC8119j5;
import p523V9.AbstractC8218w0;
import p523V9.AbstractC8226x0;
import p571X9.AbstractC9227W;
import p588Y2.C9605I;
import p588Y2.C9611O;
import p594Y9.AbstractC9985v4;
import p604Yk.C10077b;
import p658b5.C11242m;
import p658b5.C11248s;
import p720e6.C13287b;
import p720e6.C13288c;
import p769gj.C14148B;
import p769gj.C14154H;
import p769gj.C14155I;
import p769gj.C14183y;
import p769gj.InterfaceC14149C;
import p770gk.C14186b;
import p770gk.InterfaceC14185a;
import p814ik.C15031c;
import p814ik.InterfaceC15029a;
import p841k.C16288h;
import p908nk.C17645a;
import p908nk.C17646b;
import p909nm.AbstractC17659D;
import p949pj.C18490u;
import p960q9.C18655i;

/* JADX INFO: renamed from: Jj.O */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18067d2 = {"LJj/O;", "Landroidx/fragment/app/a;", "", "<init>", "()V", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class C4399O extends AbstractComponentCallbacksC11000a {

    /* JADX INFO: renamed from: h1 */
    public final C17314q f14286h1 = AbstractC9227W.m9800c(new C4391K(this, 0));

    /* JADX INFO: renamed from: i1 */
    public final ViewModelLazy f14287i1;

    public C4399O() {
        InterfaceC17306i interfaceC17306iM9799b = AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C3457c(new C4391K(this, 1), 9));
        this.f14287i1 = new ViewModelLazy(AbstractC16526C.f51263a.mo5693b(InquiryViewModel.class), new C0392b(interfaceC17306iM9799b, 2), new C4397N(this, interfaceC17306iM9799b), new C0392b(interfaceC17306iM9799b, 3));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: B */
    public final void mo5182B() {
        C5102b c5102bM5669e = AbstractC5103c.m5669e(m11743M());
        synchronized (c5102bM5669e) {
            if (c5102bM5669e.f16677a) {
                c5102bM5669e.f16678b = false;
            }
        }
        this.f33133O0 = true;
        m5185R().m14535f();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: F */
    public final void mo5183F() {
        InterfaceC15029a interfaceC15029a;
        this.f33133O0 = true;
        InquiryViewModel inquiryViewModelM5185R = m5185R();
        Context applicationContext = m11743M().getApplicationContext();
        AbstractC16544l.m18093f(applicationContext, "getApplicationContext(...)");
        C4456t c4456t = inquiryViewModelM5185R.f40709c;
        if (c4456t == null || (interfaceC15029a = (InterfaceC15029a) c4456t.f14562q.get()) == null) {
            return;
        }
        ((C15031c) interfaceC15029a).m16159a(applicationContext);
    }

    /* JADX INFO: renamed from: Q */
    public final C4377D m5184Q() {
        return (C4377D) this.f14286h1.getValue();
    }

    /* JADX INFO: renamed from: R */
    public final InquiryViewModel m5185R() {
        return (InquiryViewModel) this.f14287i1.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:102:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:104:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:106:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:111:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:114:0x0300  */
    /* JADX WARN: Code duplicated, block: B:115:0x0309  */
    /* JADX WARN: Code duplicated, block: B:118:0x0313  */
    /* JADX WARN: Code duplicated, block: B:119:0x031c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0326  */
    /* JADX WARN: Code duplicated, block: B:123:0x0331  */
    /* JADX WARN: Code duplicated, block: B:125:0x0334  */
    /* JADX WARN: Code duplicated, block: B:126:0x0339  */
    /* JADX WARN: Code duplicated, block: B:129:0x034b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0352  */
    /* JADX WARN: Code duplicated, block: B:133:0x035c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0367  */
    /* JADX WARN: Code duplicated, block: B:137:0x0371  */
    /* JADX WARN: Code duplicated, block: B:138:0x037a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0384  */
    /* JADX WARN: Code duplicated, block: B:142:0x038d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0397  */
    /* JADX WARN: Code duplicated, block: B:146:0x039f  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:154:0x040b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0453  */
    /* JADX WARN: Code duplicated, block: B:158:0x0460  */
    /* JADX WARN: Code duplicated, block: B:160:0x0479  */
    /* JADX WARN: Code duplicated, block: B:54:0x0185  */
    /* JADX WARN: Code duplicated, block: B:55:0x018f  */
    /* JADX WARN: Code duplicated, block: B:58:0x019a  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01db  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:74:0x0246  */
    /* JADX WARN: Code duplicated, block: B:75:0x024c  */
    /* JADX WARN: Code duplicated, block: B:77:0x024f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0259  */
    /* JADX WARN: Code duplicated, block: B:80:0x0260  */
    /* JADX WARN: Code duplicated, block: B:83:0x0264  */
    /* JADX WARN: Code duplicated, block: B:84:0x0266  */
    /* JADX WARN: Code duplicated, block: B:88:0x0275  */
    /* JADX WARN: Code duplicated, block: B:89:0x027d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0293  */
    /* JADX WARN: Code duplicated, block: B:95:0x029a  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b8  */
    /* JADX WARN: Instruction removed from duplicated block: B:158:0x0460, please report this as an issue */
    /* JADX INFO: renamed from: S */
    public final C14155I m5186S() {
        C3032c c3032c;
        C3032c c3032c2;
        Bundle bundle;
        boolean z6;
        Bundle bundle2;
        String string;
        Bundle bundle3;
        String string2;
        Bundle bundle4;
        boolean z10;
        boolean z11;
        Bundle bundle5;
        boolean z12;
        C4456t c4456t;
        Bundle bundle6;
        boolean z13;
        Class cls;
        boolean z14;
        Bundle bundle7;
        String string3;
        InquiryViewModel inquiryViewModelM5185R;
        Bundle bundle8;
        Bundle bundle9;
        String string4;
        Bundle bundle10;
        String string5;
        Bundle bundle11;
        String string6;
        Bundle bundle12;
        String string7;
        Bundle bundle13;
        C4389J c4389j;
        Map map;
        Bundle bundle14;
        String string8;
        Bundle bundle15;
        Integer numValueOf;
        Bundle bundle16;
        String string9;
        Bundle bundle17;
        StaticInquiryTemplate staticInquiryTemplate;
        Bundle bundle18;
        boolean z15;
        Object c4445n0;
        C2153Q0 c2153q0;
        C14155I c14155i;
        C11114w c11114w;
        InterfaceC2149O0 renderings;
        C14148B c14148b;
        C4456t c4456t2;
        C9611O c9611o;
        Bundle bundle19;
        String string10;
        Bundle bundle20;
        Integer numValueOf2;
        Bundle bundle21;
        StaticInquiryTemplate staticInquiryTemplate2;
        int i10 = 13;
        String strM5172c = m5184Q().m5172c();
        if (strM5172c != null && AbstractC21322p.m21668B(strM5172c, '\n')) {
            String strM5171b = m5184Q().m5171b();
            Bundle bundle22 = new Bundle();
            EnumC4410U enumC4410U = EnumC4410U.f14309Y;
            bundle22.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            bundle22.putString("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
            bundle22.putParcelable("ERROR_CODE_KEY", EnumC0543d.f1727r0);
            AbstractC9985v4.m10628e(this, strM5171b, bundle22);
            AbstractC11002c abstractC11002cM11754q = m11754q();
            abstractC11002cM11754q.m11813w(new C9605I(abstractC11002cM11754q, -1, 0), false);
            return null;
        }
        Context contextM11743M = m11743M();
        String packageName = contextM11743M.getPackageName();
        AbstractC16544l.m18093f(packageName, "getPackageName(...)");
        String str = "https://withpersona.com";
        if (AbstractC21329w.m21734u(packageName, "com.withpersona", false)) {
            Bundle bundle23 = m5184Q().f14246a;
            String string11 = bundle23 != null ? bundle23.getString("SERVER_ENDPOINT", "https://withpersona.com") : null;
            if (string11 != null) {
                str = string11;
            }
        }
        String packageName2 = contextM11743M.getPackageName();
        AbstractC16544l.m18093f(packageName2, "getPackageName(...)");
        String str2 = "https://webrtc-consumer.withpersona.com";
        if (AbstractC21329w.m21734u(packageName2, "com.withpersona", false)) {
            Bundle bundle24 = m5184Q().f14246a;
            String string12 = bundle24 != null ? bundle24.getString("WEB_RTC_SERVER_ENDPOINT", "https://webrtc-consumer.withpersona.com") : null;
            if (string12 != null) {
                str2 = string12;
            }
        }
        Bundle bundle25 = m5184Q().f14246a;
        InterfaceC14185a c14186b = bundle25 != null ? bundle25.getBoolean("RETURN_COLLECTED_DATA", false) : false ? m5185R().f40712f : new C14186b();
        Bundle bundle26 = m5184Q().f14246a;
        boolean z16 = bundle26 != null ? bundle26.getBoolean("SHOULD_AUTO_FALLBACK", false) : false;
        C5449b c5449b = C5449b.f17797a;
        if (!z16) {
            Bundle bundle27 = m5184Q().f14246a;
            StaticInquiryTemplate staticInquiryTemplate3 = bundle27 != null ? (StaticInquiryTemplate) AbstractC8119j5.m8621b(bundle27, "STATIC_INQUIRY_TEMPLATE_KEY", StaticInquiryTemplate.class) : null;
            LocalStaticInquiryTemplate localStaticInquiryTemplate = staticInquiryTemplate3 instanceof LocalStaticInquiryTemplate ? (LocalStaticInquiryTemplate) staticInquiryTemplate3 : null;
            if (localStaticInquiryTemplate != null) {
                c3032c2 = new C3032c(new C5450c(localStaticInquiryTemplate.getResourceId()), i10);
            } else {
                c3032c = new C3032c(c5449b, i10);
            }
            C2307e c2307e = new C2307e(this);
            C13287b c13287b = new C13287b(m11742L(), 14);
            InquiryViewModel inquiryViewModelM5185R2 = m5185R();
            InquiryViewModel inquiryViewModelM5185R3 = m5185R();
            InquiryViewModel inquiryViewModelM5185R4 = m5185R();
            C16288h pictureLaunchResultLauncher = inquiryViewModelM5185R2.f40717k;
            C16288h openDocumentsResultLauncher = inquiryViewModelM5185R3.f40719m;
            C16288h selectFromPhotoLibraryLauncher = inquiryViewModelM5185R4.f40718l;
            AbstractC16544l.m18094g(pictureLaunchResultLauncher, "pictureLaunchResultLauncher");
            AbstractC16544l.m18094g(openDocumentsResultLauncher, "openDocumentsResultLauncher");
            AbstractC16544l.m18094g(selectFromPhotoLibraryLauncher, "selectFromPhotoLibraryLauncher");
            C11242m c11242m = new C11242m();
            c11242m.f34018Y = pictureLaunchResultLauncher;
            c11242m.f34019Z = openDocumentsResultLauncher;
            c11242m.f34020o0 = selectFromPhotoLibraryLauncher;
            C18655i c18655i = new C18655i(m5185R().f40721o);
            C19506i c19506i = new C19506i(m5185R().f40720n);
            C7296c c7296c = new C7296c(m5185R().f40722p);
            C16288h customTabsLauncher = m5185R().f40723q;
            AbstractC16544l.m18094g(customTabsLauncher, "customTabsLauncher");
            C13288c c13288c = new C13288c();
            c13288c.f42001Y = customTabsLauncher;
            bundle = m5184Q().f14246a;
            if (bundle != null) {
                z6 = bundle.getBoolean("USE_SERVER_STYLES", true);
            } else {
                z6 = true;
            }
            bundle2 = m5184Q().f14246a;
            if (bundle2 != null) {
                string = bundle2.getString("ROUTING_COUNTRY");
            } else {
                string = null;
            }
            bundle3 = m5184Q().f14246a;
            if (bundle3 != null) {
                string2 = bundle3.getString("LOCALE");
            } else {
                string2 = null;
            }
            NetworkModule networkModule = new NetworkModule(z6, string, string2);
            C10077b c10077b = new C10077b(c14186b);
            C11248s c11248s = new C11248s(str, str2, false, 10);
            C15333a c15333a = new C15333a(c2307e);
            bundle4 = m5184Q().f14246a;
            if (bundle4 != null) {
                z10 = true;
                z11 = bundle4.getBoolean("CONTROL_NAVIGATION_BAR", true);
            } else {
                z10 = true;
                z11 = true;
            }
            bundle5 = m5184Q().f14246a;
            if (bundle5 != null) {
                z12 = bundle5.getBoolean("CONTROL_STATUS_BAR", z10);
            } else {
                z12 = true;
            }
            c4456t = new C4456t(networkModule, c11248s, c18655i, new C18490u(), c19506i, c13287b, c13288c, c11242m, new C15370i(20), c7296c, c10077b, new C15370i(11), new C2222a(z11, z12), c3032c2, c15333a, new C3032c(m5185R().f40716j));
            InterfaceC21546a interfaceC21546a = (InterfaceC21546a) c4456t.f14504A.get();
            bundle6 = m5184Q().f14246a;
            if (bundle6 != null) {
                z13 = bundle6.getBoolean("SHOULD_AUTO_FALLBACK", false);
            } else {
                z13 = false;
            }
            if (!z13) {
                bundle21 = m5184Q().f14246a;
                cls = StaticInquiryTemplate.class;
                if (bundle21 != null) {
                    staticInquiryTemplate2 = (StaticInquiryTemplate) AbstractC8119j5.m8621b(bundle21, "STATIC_INQUIRY_TEMPLATE_KEY", cls);
                } else {
                    staticInquiryTemplate2 = null;
                }
                if (staticInquiryTemplate2 != null) {
                    z14 = false;
                }
                ((C5461n) interfaceC21546a).f17832c = z14;
                bundle7 = m5184Q().f14246a;
                if (bundle7 != null) {
                    string3 = bundle7.getString("INQUIRY_ID_KEY");
                } else {
                    string3 = null;
                }
                inquiryViewModelM5185R = m5185R();
                m5184Q().m5170a();
                bundle8 = m5184Q().f14246a;
                if (bundle8 != null) {
                    bundle8.getString("ENVIRONMENT_ID_KEY");
                }
                if (string3 != null) {
                    String strM5172c2 = m5184Q().m5172c();
                    EnumC4458u enumC4458uM5170a = m5184Q().m5170a();
                    bundle19 = m5184Q().f14246a;
                    if (bundle19 != null) {
                        string10 = bundle19.getString("ENVIRONMENT_ID_KEY");
                    } else {
                        string10 = null;
                    }
                    bundle20 = m5184Q().f14246a;
                    if (bundle20 != null) {
                        numValueOf2 = Integer.valueOf(bundle20.getInt("THEME_KEY"));
                    } else {
                        numValueOf2 = null;
                    }
                    c4445n0 = new C4443m0(string3, strM5172c2, string10, enumC4458uM5170a, numValueOf2);
                } else {
                    bundle9 = m5184Q().f14246a;
                    if (bundle9 != null) {
                        string4 = bundle9.getString("TEMPLATE_ID_KEY");
                    } else {
                        string4 = null;
                    }
                    bundle10 = m5184Q().f14246a;
                    if (bundle10 != null) {
                        string5 = bundle10.getString("TEMPLATE_VERSION_KEY");
                    } else {
                        string5 = null;
                    }
                    bundle11 = m5184Q().f14246a;
                    if (bundle11 != null) {
                        string6 = bundle11.getString("ACCOUNT_ID_KEY");
                    } else {
                        string6 = null;
                    }
                    bundle12 = m5184Q().f14246a;
                    if (bundle12 != null) {
                        string7 = bundle12.getString("REFERENCE_ID_KEY");
                    } else {
                        string7 = null;
                    }
                    bundle13 = m5184Q().f14246a;
                    if (bundle13 != null) {
                        c4389j = (C4389J) AbstractC8119j5.m8621b(bundle13, "FIELDS_MAP_KEY", C4389J.class);
                    } else {
                        c4389j = null;
                    }
                    if (c4389j != null) {
                        map = c4389j.f14258Y;
                    } else {
                        map = null;
                    }
                    EnumC4458u enumC4458uM5170a2 = m5184Q().m5170a();
                    bundle14 = m5184Q().f14246a;
                    if (bundle14 != null) {
                        string8 = bundle14.getString("ENVIRONMENT_ID_KEY");
                    } else {
                        string8 = null;
                    }
                    bundle15 = m5184Q().f14246a;
                    if (bundle15 != null) {
                        numValueOf = Integer.valueOf(bundle15.getInt("THEME_KEY"));
                    } else {
                        numValueOf = null;
                    }
                    bundle16 = m5184Q().f14246a;
                    if (bundle16 != null) {
                        string9 = bundle16.getString("THEME_SET_ID_KEY");
                    } else {
                        string9 = null;
                    }
                    bundle17 = m5184Q().f14246a;
                    if (bundle17 != null) {
                        staticInquiryTemplate = (StaticInquiryTemplate) AbstractC8119j5.m8621b(bundle17, "STATIC_INQUIRY_TEMPLATE_KEY", cls);
                    } else {
                        staticInquiryTemplate = null;
                    }
                    bundle18 = m5184Q().f14246a;
                    if (bundle18 != null) {
                        z15 = bundle18.getBoolean("SHOULD_AUTO_FALLBACK", false);
                    } else {
                        z15 = false;
                    }
                    c4445n0 = new C4445n0(string4, string5, string6, string7, string8, map, string9, staticInquiryTemplate, z15, enumC4458uM5170a2, numValueOf);
                }
                inquiryViewModelM5185R.f40709c = c4456t;
                c2153q0 = inquiryViewModelM5185R.f40710d;
                if (c2153q0 != null) {
                    c2153q0.m3251l(null, c4445n0);
                } else {
                    inquiryViewModelM5185R.f40710d = AbstractC2124C.m3204c(c4445n0);
                }
                inquiryViewModelM5185R.f40716j.m17823c(this);
                inquiryViewModelM5185R.f40717k.m17823c(this);
                inquiryViewModelM5185R.f40718l.m17823c(this);
                inquiryViewModelM5185R.f40719m.m17823c(this);
                inquiryViewModelM5185R.f40720n.m17823c(this);
                inquiryViewModelM5185R.f40721o.m17823c(this);
                inquiryViewModelM5185R.f40722p.m17823c(this);
                inquiryViewModelM5185R.f40723q.m17823c(this);
                c14155i = new C14155I(m11743M());
                c11114w = this.f33144Y0;
                AbstractC16544l.m18093f(c11114w, "<get-lifecycle>(...)");
                renderings = (InterfaceC2149O0) m5185R().f40724r.getValue();
                c14148b = InterfaceC14149C.f44508a;
                c4456t2 = m5185R().f40709c;
                if (c4456t2 != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                C14183y c14183y = new C14183y(AbstractC17659D.m19244f(new C17309l(c14148b, (InterfaceC14149C) c4456t2.f14577x0.get()), new C17309l(C17646b.f56435b, (C17645a) c4456t.f14565r0.get())));
                EnumC11104m enumC11104m = EnumC11104m.f33477p0;
                AbstractC16544l.m18094g(renderings, "renderings");
                AbstractC0575H.m1156D(AbstractC8218w0.m8848c(c11114w), null, null, new C14154H(c11114w, enumC11104m, renderings, c14155i, c14183y, null), 3);
                c9611o = this.f33146Z0;
                if (c9611o != null) {
                    AbstractC0575H.m1156D(AbstractC8226x0.m8861b(c9611o), null, null, new C4395M(this, c4456t, null), 3);
                    return c14155i;
                }
                throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
            }
            cls = StaticInquiryTemplate.class;
            z14 = true;
            ((C5461n) interfaceC21546a).f17832c = z14;
            bundle7 = m5184Q().f14246a;
            if (bundle7 != null) {
                string3 = bundle7.getString("INQUIRY_ID_KEY");
            } else {
                string3 = null;
            }
            inquiryViewModelM5185R = m5185R();
            m5184Q().m5170a();
            bundle8 = m5184Q().f14246a;
            if (bundle8 != null) {
                bundle8.getString("ENVIRONMENT_ID_KEY");
            }
            if (string3 != null) {
                String strM5172c3 = m5184Q().m5172c();
                EnumC4458u enumC4458uM5170a3 = m5184Q().m5170a();
                bundle19 = m5184Q().f14246a;
                if (bundle19 != null) {
                    string10 = bundle19.getString("ENVIRONMENT_ID_KEY");
                } else {
                    string10 = null;
                }
                bundle20 = m5184Q().f14246a;
                if (bundle20 != null) {
                    numValueOf2 = Integer.valueOf(bundle20.getInt("THEME_KEY"));
                } else {
                    numValueOf2 = null;
                }
                c4445n0 = new C4443m0(string3, strM5172c3, string10, enumC4458uM5170a3, numValueOf2);
            } else {
                bundle9 = m5184Q().f14246a;
                if (bundle9 != null) {
                    string4 = bundle9.getString("TEMPLATE_ID_KEY");
                } else {
                    string4 = null;
                }
                bundle10 = m5184Q().f14246a;
                if (bundle10 != null) {
                    string5 = bundle10.getString("TEMPLATE_VERSION_KEY");
                } else {
                    string5 = null;
                }
                bundle11 = m5184Q().f14246a;
                if (bundle11 != null) {
                    string6 = bundle11.getString("ACCOUNT_ID_KEY");
                } else {
                    string6 = null;
                }
                bundle12 = m5184Q().f14246a;
                if (bundle12 != null) {
                    string7 = bundle12.getString("REFERENCE_ID_KEY");
                } else {
                    string7 = null;
                }
                bundle13 = m5184Q().f14246a;
                if (bundle13 != null) {
                    c4389j = (C4389J) AbstractC8119j5.m8621b(bundle13, "FIELDS_MAP_KEY", C4389J.class);
                } else {
                    c4389j = null;
                }
                if (c4389j != null) {
                    map = c4389j.f14258Y;
                } else {
                    map = null;
                }
                EnumC4458u enumC4458uM5170a4 = m5184Q().m5170a();
                bundle14 = m5184Q().f14246a;
                if (bundle14 != null) {
                    string8 = bundle14.getString("ENVIRONMENT_ID_KEY");
                } else {
                    string8 = null;
                }
                bundle15 = m5184Q().f14246a;
                if (bundle15 != null) {
                    numValueOf = Integer.valueOf(bundle15.getInt("THEME_KEY"));
                } else {
                    numValueOf = null;
                }
                bundle16 = m5184Q().f14246a;
                if (bundle16 != null) {
                    string9 = bundle16.getString("THEME_SET_ID_KEY");
                } else {
                    string9 = null;
                }
                bundle17 = m5184Q().f14246a;
                if (bundle17 != null) {
                    staticInquiryTemplate = (StaticInquiryTemplate) AbstractC8119j5.m8621b(bundle17, "STATIC_INQUIRY_TEMPLATE_KEY", cls);
                } else {
                    staticInquiryTemplate = null;
                }
                bundle18 = m5184Q().f14246a;
                if (bundle18 != null) {
                    z15 = bundle18.getBoolean("SHOULD_AUTO_FALLBACK", false);
                } else {
                    z15 = false;
                }
                c4445n0 = new C4445n0(string4, string5, string6, string7, string8, map, string9, staticInquiryTemplate, z15, enumC4458uM5170a4, numValueOf);
            }
            inquiryViewModelM5185R.f40709c = c4456t;
            c2153q0 = inquiryViewModelM5185R.f40710d;
            if (c2153q0 != null) {
                c2153q0.m3251l(null, c4445n0);
            } else {
                inquiryViewModelM5185R.f40710d = AbstractC2124C.m3204c(c4445n0);
            }
            inquiryViewModelM5185R.f40716j.m17823c(this);
            inquiryViewModelM5185R.f40717k.m17823c(this);
            inquiryViewModelM5185R.f40718l.m17823c(this);
            inquiryViewModelM5185R.f40719m.m17823c(this);
            inquiryViewModelM5185R.f40720n.m17823c(this);
            inquiryViewModelM5185R.f40721o.m17823c(this);
            inquiryViewModelM5185R.f40722p.m17823c(this);
            inquiryViewModelM5185R.f40723q.m17823c(this);
            c14155i = new C14155I(m11743M());
            c11114w = this.f33144Y0;
            AbstractC16544l.m18093f(c11114w, "<get-lifecycle>(...)");
            renderings = (InterfaceC2149O0) m5185R().f40724r.getValue();
            c14148b = InterfaceC14149C.f44508a;
            c4456t2 = m5185R().f40709c;
            if (c4456t2 != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C14183y c14183y2 = new C14183y(AbstractC17659D.m19244f(new C17309l(c14148b, (InterfaceC14149C) c4456t2.f14577x0.get()), new C17309l(C17646b.f56435b, (C17645a) c4456t.f14565r0.get())));
            EnumC11104m enumC11104m2 = EnumC11104m.f33477p0;
            AbstractC16544l.m18094g(renderings, "renderings");
            AbstractC0575H.m1156D(AbstractC8218w0.m8848c(c11114w), null, null, new C14154H(c11114w, enumC11104m2, renderings, c14155i, c14183y2, null), 3);
            c9611o = this.f33146Z0;
            if (c9611o != null) {
                AbstractC0575H.m1156D(AbstractC8226x0.m8861b(c9611o), null, null, new C4395M(this, c4456t, null), 3);
                return c14155i;
            }
            throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        c3032c = new C3032c(c5449b, i10);
        c3032c2 = c3032c;
        C2307e c2307e2 = new C2307e(this);
        C13287b c13287b2 = new C13287b(m11742L(), 14);
        InquiryViewModel inquiryViewModelM5185R5 = m5185R();
        InquiryViewModel inquiryViewModelM5185R6 = m5185R();
        InquiryViewModel inquiryViewModelM5185R7 = m5185R();
        C16288h pictureLaunchResultLauncher2 = inquiryViewModelM5185R5.f40717k;
        C16288h openDocumentsResultLauncher2 = inquiryViewModelM5185R6.f40719m;
        C16288h selectFromPhotoLibraryLauncher2 = inquiryViewModelM5185R7.f40718l;
        AbstractC16544l.m18094g(pictureLaunchResultLauncher2, "pictureLaunchResultLauncher");
        AbstractC16544l.m18094g(openDocumentsResultLauncher2, "openDocumentsResultLauncher");
        AbstractC16544l.m18094g(selectFromPhotoLibraryLauncher2, "selectFromPhotoLibraryLauncher");
        C11242m c11242m2 = new C11242m();
        c11242m2.f34018Y = pictureLaunchResultLauncher2;
        c11242m2.f34019Z = openDocumentsResultLauncher2;
        c11242m2.f34020o0 = selectFromPhotoLibraryLauncher2;
        C18655i c18655i2 = new C18655i(m5185R().f40721o);
        C19506i c19506i2 = new C19506i(m5185R().f40720n);
        C7296c c7296c2 = new C7296c(m5185R().f40722p);
        C16288h customTabsLauncher2 = m5185R().f40723q;
        AbstractC16544l.m18094g(customTabsLauncher2, "customTabsLauncher");
        C13288c c13288c2 = new C13288c();
        c13288c2.f42001Y = customTabsLauncher2;
        bundle = m5184Q().f14246a;
        if (bundle != null) {
            z6 = bundle.getBoolean("USE_SERVER_STYLES", true);
        } else {
            z6 = true;
        }
        bundle2 = m5184Q().f14246a;
        if (bundle2 != null) {
            string = bundle2.getString("ROUTING_COUNTRY");
        } else {
            string = null;
        }
        bundle3 = m5184Q().f14246a;
        if (bundle3 != null) {
            string2 = bundle3.getString("LOCALE");
        } else {
            string2 = null;
        }
        NetworkModule networkModule2 = new NetworkModule(z6, string, string2);
        C10077b c10077b2 = new C10077b(c14186b);
        C11248s c11248s2 = new C11248s(str, str2, false, 10);
        C15333a c15333a2 = new C15333a(c2307e2);
        bundle4 = m5184Q().f14246a;
        if (bundle4 != null) {
            z10 = true;
            z11 = bundle4.getBoolean("CONTROL_NAVIGATION_BAR", true);
        } else {
            z10 = true;
            z11 = true;
        }
        bundle5 = m5184Q().f14246a;
        if (bundle5 != null) {
            z12 = bundle5.getBoolean("CONTROL_STATUS_BAR", z10);
        } else {
            z12 = true;
        }
        c4456t = new C4456t(networkModule2, c11248s2, c18655i2, new C18490u(), c19506i2, c13287b2, c13288c2, c11242m2, new C15370i(20), c7296c2, c10077b2, new C15370i(11), new C2222a(z11, z12), c3032c2, c15333a2, new C3032c(m5185R().f40716j));
        InterfaceC21546a interfaceC21546a2 = (InterfaceC21546a) c4456t.f14504A.get();
        bundle6 = m5184Q().f14246a;
        if (bundle6 != null) {
            z13 = bundle6.getBoolean("SHOULD_AUTO_FALLBACK", false);
        } else {
            z13 = false;
        }
        if (!z13) {
            bundle21 = m5184Q().f14246a;
            cls = StaticInquiryTemplate.class;
            if (bundle21 != null) {
                staticInquiryTemplate2 = (StaticInquiryTemplate) AbstractC8119j5.m8621b(bundle21, "STATIC_INQUIRY_TEMPLATE_KEY", cls);
            } else {
                staticInquiryTemplate2 = null;
            }
            if (staticInquiryTemplate2 != null) {
                z14 = false;
            }
            ((C5461n) interfaceC21546a2).f17832c = z14;
            bundle7 = m5184Q().f14246a;
            if (bundle7 != null) {
                string3 = bundle7.getString("INQUIRY_ID_KEY");
            } else {
                string3 = null;
            }
            inquiryViewModelM5185R = m5185R();
            m5184Q().m5170a();
            bundle8 = m5184Q().f14246a;
            if (bundle8 != null) {
                bundle8.getString("ENVIRONMENT_ID_KEY");
            }
            if (string3 != null) {
                String strM5172c4 = m5184Q().m5172c();
                EnumC4458u enumC4458uM5170a5 = m5184Q().m5170a();
                bundle19 = m5184Q().f14246a;
                if (bundle19 != null) {
                    string10 = bundle19.getString("ENVIRONMENT_ID_KEY");
                } else {
                    string10 = null;
                }
                bundle20 = m5184Q().f14246a;
                if (bundle20 != null) {
                    numValueOf2 = Integer.valueOf(bundle20.getInt("THEME_KEY"));
                } else {
                    numValueOf2 = null;
                }
                c4445n0 = new C4443m0(string3, strM5172c4, string10, enumC4458uM5170a5, numValueOf2);
            } else {
                bundle9 = m5184Q().f14246a;
                if (bundle9 != null) {
                    string4 = bundle9.getString("TEMPLATE_ID_KEY");
                } else {
                    string4 = null;
                }
                bundle10 = m5184Q().f14246a;
                if (bundle10 != null) {
                    string5 = bundle10.getString("TEMPLATE_VERSION_KEY");
                } else {
                    string5 = null;
                }
                bundle11 = m5184Q().f14246a;
                if (bundle11 != null) {
                    string6 = bundle11.getString("ACCOUNT_ID_KEY");
                } else {
                    string6 = null;
                }
                bundle12 = m5184Q().f14246a;
                if (bundle12 != null) {
                    string7 = bundle12.getString("REFERENCE_ID_KEY");
                } else {
                    string7 = null;
                }
                bundle13 = m5184Q().f14246a;
                if (bundle13 != null) {
                    c4389j = (C4389J) AbstractC8119j5.m8621b(bundle13, "FIELDS_MAP_KEY", C4389J.class);
                } else {
                    c4389j = null;
                }
                if (c4389j != null) {
                    map = c4389j.f14258Y;
                } else {
                    map = null;
                }
                EnumC4458u enumC4458uM5170a6 = m5184Q().m5170a();
                bundle14 = m5184Q().f14246a;
                if (bundle14 != null) {
                    string8 = bundle14.getString("ENVIRONMENT_ID_KEY");
                } else {
                    string8 = null;
                }
                bundle15 = m5184Q().f14246a;
                if (bundle15 != null) {
                    numValueOf = Integer.valueOf(bundle15.getInt("THEME_KEY"));
                } else {
                    numValueOf = null;
                }
                bundle16 = m5184Q().f14246a;
                if (bundle16 != null) {
                    string9 = bundle16.getString("THEME_SET_ID_KEY");
                } else {
                    string9 = null;
                }
                bundle17 = m5184Q().f14246a;
                if (bundle17 != null) {
                    staticInquiryTemplate = (StaticInquiryTemplate) AbstractC8119j5.m8621b(bundle17, "STATIC_INQUIRY_TEMPLATE_KEY", cls);
                } else {
                    staticInquiryTemplate = null;
                }
                bundle18 = m5184Q().f14246a;
                if (bundle18 != null) {
                    z15 = bundle18.getBoolean("SHOULD_AUTO_FALLBACK", false);
                } else {
                    z15 = false;
                }
                c4445n0 = new C4445n0(string4, string5, string6, string7, string8, map, string9, staticInquiryTemplate, z15, enumC4458uM5170a6, numValueOf);
            }
            inquiryViewModelM5185R.f40709c = c4456t;
            c2153q0 = inquiryViewModelM5185R.f40710d;
            if (c2153q0 != null) {
                c2153q0.m3251l(null, c4445n0);
            } else {
                inquiryViewModelM5185R.f40710d = AbstractC2124C.m3204c(c4445n0);
            }
            inquiryViewModelM5185R.f40716j.m17823c(this);
            inquiryViewModelM5185R.f40717k.m17823c(this);
            inquiryViewModelM5185R.f40718l.m17823c(this);
            inquiryViewModelM5185R.f40719m.m17823c(this);
            inquiryViewModelM5185R.f40720n.m17823c(this);
            inquiryViewModelM5185R.f40721o.m17823c(this);
            inquiryViewModelM5185R.f40722p.m17823c(this);
            inquiryViewModelM5185R.f40723q.m17823c(this);
            c14155i = new C14155I(m11743M());
            c11114w = this.f33144Y0;
            AbstractC16544l.m18093f(c11114w, "<get-lifecycle>(...)");
            renderings = (InterfaceC2149O0) m5185R().f40724r.getValue();
            c14148b = InterfaceC14149C.f44508a;
            c4456t2 = m5185R().f40709c;
            if (c4456t2 != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C14183y c14183y3 = new C14183y(AbstractC17659D.m19244f(new C17309l(c14148b, (InterfaceC14149C) c4456t2.f14577x0.get()), new C17309l(C17646b.f56435b, (C17645a) c4456t.f14565r0.get())));
            EnumC11104m enumC11104m3 = EnumC11104m.f33477p0;
            AbstractC16544l.m18094g(renderings, "renderings");
            AbstractC0575H.m1156D(AbstractC8218w0.m8848c(c11114w), null, null, new C14154H(c11114w, enumC11104m3, renderings, c14155i, c14183y3, null), 3);
            c9611o = this.f33146Z0;
            if (c9611o != null) {
                AbstractC0575H.m1156D(AbstractC8226x0.m8861b(c9611o), null, null, new C4395M(this, c4456t, null), 3);
                return c14155i;
            }
            throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        cls = StaticInquiryTemplate.class;
        z14 = true;
        ((C5461n) interfaceC21546a2).f17832c = z14;
        bundle7 = m5184Q().f14246a;
        if (bundle7 != null) {
            string3 = bundle7.getString("INQUIRY_ID_KEY");
        } else {
            string3 = null;
        }
        inquiryViewModelM5185R = m5185R();
        m5184Q().m5170a();
        bundle8 = m5184Q().f14246a;
        if (bundle8 != null) {
            bundle8.getString("ENVIRONMENT_ID_KEY");
        }
        if (string3 != null) {
            String strM5172c5 = m5184Q().m5172c();
            EnumC4458u enumC4458uM5170a7 = m5184Q().m5170a();
            bundle19 = m5184Q().f14246a;
            if (bundle19 != null) {
                string10 = bundle19.getString("ENVIRONMENT_ID_KEY");
            } else {
                string10 = null;
            }
            bundle20 = m5184Q().f14246a;
            if (bundle20 != null) {
                numValueOf2 = Integer.valueOf(bundle20.getInt("THEME_KEY"));
            } else {
                numValueOf2 = null;
            }
            c4445n0 = new C4443m0(string3, strM5172c5, string10, enumC4458uM5170a7, numValueOf2);
        } else {
            bundle9 = m5184Q().f14246a;
            if (bundle9 != null) {
                string4 = bundle9.getString("TEMPLATE_ID_KEY");
            } else {
                string4 = null;
            }
            bundle10 = m5184Q().f14246a;
            if (bundle10 != null) {
                string5 = bundle10.getString("TEMPLATE_VERSION_KEY");
            } else {
                string5 = null;
            }
            bundle11 = m5184Q().f14246a;
            if (bundle11 != null) {
                string6 = bundle11.getString("ACCOUNT_ID_KEY");
            } else {
                string6 = null;
            }
            bundle12 = m5184Q().f14246a;
            if (bundle12 != null) {
                string7 = bundle12.getString("REFERENCE_ID_KEY");
            } else {
                string7 = null;
            }
            bundle13 = m5184Q().f14246a;
            if (bundle13 != null) {
                c4389j = (C4389J) AbstractC8119j5.m8621b(bundle13, "FIELDS_MAP_KEY", C4389J.class);
            } else {
                c4389j = null;
            }
            if (c4389j != null) {
                map = c4389j.f14258Y;
            } else {
                map = null;
            }
            EnumC4458u enumC4458uM5170a8 = m5184Q().m5170a();
            bundle14 = m5184Q().f14246a;
            if (bundle14 != null) {
                string8 = bundle14.getString("ENVIRONMENT_ID_KEY");
            } else {
                string8 = null;
            }
            bundle15 = m5184Q().f14246a;
            if (bundle15 != null) {
                numValueOf = Integer.valueOf(bundle15.getInt("THEME_KEY"));
            } else {
                numValueOf = null;
            }
            bundle16 = m5184Q().f14246a;
            if (bundle16 != null) {
                string9 = bundle16.getString("THEME_SET_ID_KEY");
            } else {
                string9 = null;
            }
            bundle17 = m5184Q().f14246a;
            if (bundle17 != null) {
                staticInquiryTemplate = (StaticInquiryTemplate) AbstractC8119j5.m8621b(bundle17, "STATIC_INQUIRY_TEMPLATE_KEY", cls);
            } else {
                staticInquiryTemplate = null;
            }
            bundle18 = m5184Q().f14246a;
            if (bundle18 != null) {
                z15 = bundle18.getBoolean("SHOULD_AUTO_FALLBACK", false);
            } else {
                z15 = false;
            }
            c4445n0 = new C4445n0(string4, string5, string6, string7, string8, map, string9, staticInquiryTemplate, z15, enumC4458uM5170a8, numValueOf);
        }
        inquiryViewModelM5185R.f40709c = c4456t;
        c2153q0 = inquiryViewModelM5185R.f40710d;
        if (c2153q0 != null) {
            c2153q0.m3251l(null, c4445n0);
        } else {
            inquiryViewModelM5185R.f40710d = AbstractC2124C.m3204c(c4445n0);
        }
        inquiryViewModelM5185R.f40716j.m17823c(this);
        inquiryViewModelM5185R.f40717k.m17823c(this);
        inquiryViewModelM5185R.f40718l.m17823c(this);
        inquiryViewModelM5185R.f40719m.m17823c(this);
        inquiryViewModelM5185R.f40720n.m17823c(this);
        inquiryViewModelM5185R.f40721o.m17823c(this);
        inquiryViewModelM5185R.f40722p.m17823c(this);
        inquiryViewModelM5185R.f40723q.m17823c(this);
        c14155i = new C14155I(m11743M());
        c11114w = this.f33144Y0;
        AbstractC16544l.m18093f(c11114w, "<get-lifecycle>(...)");
        renderings = (InterfaceC2149O0) m5185R().f40724r.getValue();
        c14148b = InterfaceC14149C.f44508a;
        c4456t2 = m5185R().f40709c;
        if (c4456t2 != null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C14183y c14183y4 = new C14183y(AbstractC17659D.m19244f(new C17309l(c14148b, (InterfaceC14149C) c4456t2.f14577x0.get()), new C17309l(C17646b.f56435b, (C17645a) c4456t.f14565r0.get())));
        EnumC11104m enumC11104m4 = EnumC11104m.f33477p0;
        AbstractC16544l.m18094g(renderings, "renderings");
        AbstractC0575H.m1156D(AbstractC8218w0.m8848c(c11114w), null, null, new C14154H(c11114w, enumC11104m4, renderings, c14155i, c14183y4, null), 3);
        c9611o = this.f33146Z0;
        if (c9611o != null) {
            AbstractC0575H.m1156D(AbstractC8226x0.m8861b(c9611o), null, null, new C4395M(this, c4456t, null), 3);
            return c14155i;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: z */
    public final void mo5187z(Bundle bundle) {
        super.mo5187z(bundle);
        Context contextM11743M = m11743M();
        C21277a c21277a = (C21277a) AbstractC5103c.m5669e(contextM11743M).f16679c;
        c21277a.getClass();
        new File(c21277a.f67671a, "last_error.txt").delete();
        Bundle bundle2 = m5184Q().f14246a;
        if (!(bundle2 != null ? bundle2.getBoolean("ENABLE_ERROR_LOGGING", true) : true)) {
            Bundle bundle3 = m5184Q().f14246a;
            if (!(bundle3 != null ? bundle3.getBoolean("CONSUME_EXCEPTIONS", false) : false)) {
                return;
            }
        }
        final C5102b c5102bM5669e = AbstractC5103c.m5669e(contextM11743M);
        synchronized (c5102bM5669e) {
            if (c5102bM5669e.f16677a) {
                return;
            }
            c5102bM5669e.f16677a = true;
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: Lj.a
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    C5102b this$0 = c5102bM5669e;
                    AbstractC16544l.m18094g(this$0, "this$0");
                    AbstractC16544l.m18091d(th2);
                    this$0.m5664a(th2);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th2);
                    } else {
                        System.exit(1);
                        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: A */
    public final View mo5181A(LayoutInflater inflater, ViewGroup viewGroup) throws Exception {
        AbstractC16544l.m18094g(inflater, "inflater");
        Context contextM11743M = m11743M();
        try {
            return m5186S();
        } catch (Exception e10) {
            Bundle bundle = m5184Q().f14246a;
            if (!(bundle != null ? bundle.getBoolean("CONSUME_EXCEPTIONS", false) : false)) {
                throw e10;
            }
            Bundle bundle2 = m5184Q().f14246a;
            if (bundle2 != null ? bundle2.getBoolean("ENABLE_ERROR_LOGGING", true) : true) {
                AbstractC5103c.m5669e(contextM11743M).m5664a(e10);
            }
            String strM5171b = m5184Q().m5171b();
            Bundle bundle3 = new Bundle();
            EnumC4410U enumC4410U = EnumC4410U.f14309Y;
            bundle3.putString("PERSONA_ACTIVITY_RESULT", EhBykzn.mmfDyScEto);
            bundle3.putString("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            bundle3.putParcelable("ERROR_CODE_KEY", EnumC0543d.f1732w0);
            AbstractC9985v4.m10628e(this, strM5171b, bundle3);
            AbstractC11002c abstractC11002cM11754q = m11754q();
            abstractC11002cM11754q.m11813w(new C9605I(abstractC11002cM11754q, -1, 0), false);
            return null;
        }
    }
}
