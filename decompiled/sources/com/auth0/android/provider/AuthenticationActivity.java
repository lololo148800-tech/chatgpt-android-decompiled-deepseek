package com.auth0.android.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.auth0.android.request.internal.C11845d;
import com.auth0.android.request.internal.C11846e;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p057C3.RunnableC1543V;
import p1009s9.C19506i;
import p521V6.AbstractC7807J;
import p521V6.C7816i;
import p521V6.C7817j;
import p594Y9.AbstractC9750J2;
import p618Za.C10265d;
import p618Za.C10266e;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p826j6.C16137F;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m18067d2 = {"Lcom/auth0/android/provider/AuthenticationActivity;", "Landroid/app/Activity;", "<init>", "()V", "Y9/i0", "auth0_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class AuthenticationActivity extends Activity {

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ int f35963o0 = 0;

    /* JADX INFO: renamed from: Y */
    public boolean f35964Y;

    /* JADX INFO: renamed from: Z */
    public C7816i f35965Z;

    /* JADX INFO: renamed from: a */
    public static void m13154a(Intent intent) {
        if (AbstractC7807J.f24700b == null) {
            AbstractC15256t.m16482t(AbstractC7807J.f24699a, "There is no previous instance of this provider.");
            return;
        }
        C16137F c16137f = new C16137F(intent);
        AbstractC9750J2 abstractC9750J2 = AbstractC7807J.f24700b;
        AbstractC16544l.m18091d(abstractC9750J2);
        if (abstractC9750J2.mo8086c(c16137f)) {
            AbstractC7807J.f24700b = null;
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (i11 == 0) {
            intent = new Intent();
        }
        m13154a(intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f35964Y = bundle.getBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", false);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C7816i c7816i = this.f35965Z;
        if (c7816i != null) {
            Log.v("i", "Trying to unbind the service");
            Context context = (Context) c7816i.f24705b.get();
            if (c7816i.f24711h && context != null) {
                context.unbindService(c7816i);
                c7816i.f24711h = false;
            }
            C10266e c10266e = c7816i.f24709f;
            if (!c10266e.f30496h) {
                C10265d c10265d = c10266e.f30493e;
                if (c10265d != null) {
                    c10266e.f30489a.unbindService(c10265d);
                }
                c10266e.f30489a = null;
                c10266e.f30496h = true;
            }
            this.f35965Z = null;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (!this.f35964Y && intent.getExtras() == null) {
            finish();
            return;
        }
        if (this.f35964Y) {
            if (intent.getData() == null) {
                setResult(0);
            }
            m13154a(intent);
            finish();
            return;
        }
        this.f35964Y = true;
        Bundle extras = getIntent().getExtras();
        AbstractC16544l.m18091d(extras);
        Uri uri = (Uri) extras.getParcelable("com.auth0.android.EXTRA_AUTHORIZE_URI");
        Parcelable parcelable = extras.getParcelable("com.auth0.android.EXTRA_CT_OPTIONS");
        AbstractC16544l.m18091d(parcelable);
        boolean z6 = extras.getBoolean("com.auth0.android.EXTRA_LAUNCH_AS_TWA", false);
        C7816i c7816i = new C7816i(this, (C7817j) parcelable, new C10266e(this));
        this.f35965Z = c7816i;
        c7816i.m8080b();
        C7816i c7816i2 = this.f35965Z;
        AbstractC16544l.m18091d(c7816i2);
        AbstractC16544l.m18091d(uri);
        C11845d c11845dM20002q = C11845d.f35974b.m20002q();
        C19506i c19506i = new C19506i(this, 21);
        Context context = (Context) c7816i2.f24705b.get();
        if (context == null) {
            Log.v("i", "Custom Tab Context was no longer valid.");
        } else {
            ((Executor) ((C11846e) c11845dM20002q.f35976a).f35977Y).execute(new RunnableC1543V(c7816i2, z6, context, uri, c11845dM20002q, c19506i));
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC16544l.m18094g(bundle, MMVKXkcLpuHFDi.WKhwEsd);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", this.f35964Y);
    }
}
