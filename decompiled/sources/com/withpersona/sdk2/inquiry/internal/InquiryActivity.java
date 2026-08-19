package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.ViewModelLazy;
import cn.UfGr.EhBykzn;
import com.openai.chatgpt.R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17314q;
import p022Ak.EnumC0543d;
import p1113xn.AbstractC21322p;
import p239Ja.C4307j;
import p247Jj.C4371A;
import p247Jj.C4377D;
import p247Jj.C4399O;
import p247Jj.C4456t;
import p247Jj.C4468z;
import p247Jj.EnumC4410U;
import p295Lj.AbstractC5103c;
import p295Lj.C5102b;
import p544W9.AbstractC8736x;
import p571X9.AbstractC9227W;
import p588Y2.C9600D;
import p588Y2.C9603G;
import p588Y2.C9606J;
import p588Y2.C9617a;
import p772h.AbstractC14230l;
import p772h.C14217H;
import p772h.C14218I;
import p772h.C14231m;
import p772h.C14232n;
import p772h.C14233o;
import p772h.C14234p;
import p772h.C14235q;
import p814ik.C15031c;
import p814ik.InterfaceC15029a;
import p893n.AbstractActivityC17375g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;", "Ln/g;", "<init>", "()V", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InquiryActivity extends AbstractActivityC17375g {

    /* JADX INFO: renamed from: O0 */
    public static final /* synthetic */ int f40657O0 = 0;

    /* JADX INFO: renamed from: M0 */
    public final C17314q f40658M0 = AbstractC9227W.m9800c(new C4468z(this, 0));

    /* JADX INFO: renamed from: N0 */
    public final ViewModelLazy f40659N0 = new ViewModelLazy(AbstractC16526C.f51263a.mo5693b(InquiryViewModel.class), new C4468z(this, 1), new C4371A(this), new C4468z(this, 2));

    @Override // androidx.fragment.app.AbstractActivityC11001b, androidx.activity.AbstractActivityC10817a, p896n2.AbstractActivityC17454g, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        AbstractC8736x c14232n;
        int i10 = AbstractC14230l.f44683a;
        C14217H c14217h = C14217H.f44648Z;
        C14218I c14218i = new C14218I(0, 0, c14217h);
        C14218I c14218i2 = new C14218I(AbstractC14230l.f44683a, AbstractC14230l.f44684b, c14217h);
        View decorView = getWindow().getDecorView();
        AbstractC16544l.m18093f(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        AbstractC16544l.m18093f(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) c14217h.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        AbstractC16544l.m18093f(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) c14217h.invoke(resources2)).booleanValue();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            c14232n = new C14235q();
        } else if (i11 >= 29) {
            c14232n = new C14234p();
        } else if (i11 >= 28) {
            c14232n = new C14233o();
        } else {
            c14232n = i11 >= 26 ? new C14232n() : new C14231m();
        }
        AbstractC8736x abstractC8736x = c14232n;
        Window window = getWindow();
        AbstractC16544l.m18093f(window, "window");
        abstractC8736x.mo9471c(c14218i, c14218i2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = getWindow();
        AbstractC16544l.m18093f(window2, "window");
        abstractC8736x.mo9470a(window2);
        if (i11 >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        super.onCreate(bundle);
        try {
            m14534t(bundle);
        } catch (Exception e10) {
            Bundle bundle2 = m14533s().f14246a;
            if (!(bundle2 != null ? bundle2.getBoolean("CONSUME_EXCEPTIONS", false) : false)) {
                throw e10;
            }
            Bundle bundle3 = m14533s().f14246a;
            if (bundle3 != null ? bundle3.getBoolean("ENABLE_ERROR_LOGGING", true) : true) {
                AbstractC5103c.m5669e(this).m5664a(e10);
            }
            Intent intent = new Intent();
            EnumC4410U enumC4410U = EnumC4410U.f14309Y;
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            intent.putExtra("ERROR_CODE_KEY", (Parcelable) EnumC0543d.f1732w0);
            setResult(0, intent);
            finish();
        }
    }

    @Override // p893n.AbstractActivityC17375g, androidx.fragment.app.AbstractActivityC11001b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((InquiryViewModel) this.f40659N0.getValue()).m14535f();
    }

    @Override // androidx.fragment.app.AbstractActivityC11001b, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (isFinishing()) {
            C5102b c5102bM5669e = AbstractC5103c.m5669e(this);
            synchronized (c5102bM5669e) {
                if (c5102bM5669e.f16677a) {
                    c5102bM5669e.f16678b = false;
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC11001b, android.app.Activity
    public final void onResume() {
        InterfaceC15029a interfaceC15029a;
        super.onResume();
        InquiryViewModel inquiryViewModel = (InquiryViewModel) this.f40659N0.getValue();
        Context applicationContext = getApplicationContext();
        AbstractC16544l.m18093f(applicationContext, "getApplicationContext(...)");
        C4456t c4456t = inquiryViewModel.f40709c;
        if (c4456t == null || (interfaceC15029a = (InterfaceC15029a) c4456t.f14562q.get()) == null) {
            return;
        }
        ((C15031c) interfaceC15029a).m16159a(applicationContext);
    }

    /* JADX INFO: renamed from: s */
    public final C4377D m14533s() {
        return (C4377D) this.f40658M0.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final void m14534t(Bundle bundle) {
        String string;
        String strM21702j0;
        Integer numValueOf;
        String strM5172c = m14533s().m5172c();
        if (strM5172c != null && AbstractC21322p.m21668B(strM5172c, '\n')) {
            Intent intent = new Intent();
            EnumC4410U enumC4410U = EnumC4410U.f14309Y;
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
            intent.putExtra(EhBykzn.ogjpjMuo, (Parcelable) EnumC0543d.f1727r0);
            setResult(0, intent);
            finish();
            return;
        }
        Intent intent2 = new Intent();
        EnumC4410U enumC4410U2 = EnumC4410U.f14309Y;
        intent2.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
        Bundle bundle2 = m14533s().f14246a;
        if (bundle2 != null) {
            string = bundle2.getString("INQUIRY_ID_KEY");
        } else {
            string = null;
        }
        intent2.putExtra("INQUIRY_ID_KEY", string);
        String strM5172c2 = m14533s().m5172c();
        if (strM5172c2 != null) {
            strM21702j0 = AbstractC21322p.m21702j0(strM5172c2, "Bearer ");
        } else {
            strM21702j0 = null;
        }
        intent2.putExtra("SESSION_TOKEN_KEY", strM21702j0);
        setResult(0, intent2);
        Bundle bundle3 = m14533s().f14246a;
        if (bundle3 != null) {
            numValueOf = Integer.valueOf(bundle3.getInt("THEME_KEY"));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            setTheme(numValueOf.intValue());
        }
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.pi2_inquiry_activity, (ViewGroup) null, false);
        if (viewInflate != null) {
            setContentView((FrameLayout) viewInflate);
            if (bundle == null) {
                C9606J c9606jM11762n = m11762n();
                AbstractC16544l.m18093f(c9606jM11762n, "getSupportFragmentManager(...)");
                C9617a c9617a = new C9617a(c9606jM11762n);
                C4399O c4399o = new C4399O();
                c4399o.m11746P(getIntent().getExtras());
                c9617a.m10162e(R.id.fragment_content, c4399o, null, 2);
                c9617a.m10161d(false);
            }
            C9606J c9606jM11762n2 = m11762n();
            String strM5171b = m14533s().m5171b();
            C4307j c4307j = new C4307j(this, 1);
            c9606jM11762n2.getClass();
            C11114w c11114w = this.f55801Y;
            if (c11114w.f33504d != EnumC11104m.f33474Y) {
                C9600D c9600d = new C9600D(c9606jM11762n2, strM5171b, c4307j, c11114w);
                C9603G c9603g = (C9603G) c9606jM11762n2.f33195l.put(strM5171b, new C9603G(c11114w, c4307j, c9600d));
                if (c9603g != null) {
                    c9603g.f28900a.mo7808c(c9603g.f28902c);
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Setting FragmentResultListener with key " + strM5171b + " lifecycleOwner " + c11114w + " and listener " + c4307j);
                }
                c11114w.mo7806a(c9600d);
                return;
            }
            return;
        }
        throw new NullPointerException("rootView");
    }
}
