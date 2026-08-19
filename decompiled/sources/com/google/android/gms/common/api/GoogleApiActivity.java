package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Build;
import android.os.Bundle;
import io.sentry.android.core.AbstractC15256t;
import p1009s9.C19499b;
import p1009s9.C19502e;
import p1036u9.C20159e;
import p1060v9.AbstractC20502t;
import p377P9.HandlerC6378d;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ int f36043Z = 0;

    /* JADX INFO: renamed from: Y */
    public int f36044Y = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f36044Y = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                C20159e c20159eM20979g = C20159e.m20979g(this);
                if (i11 == -1) {
                    HandlerC6378d handlerC6378d = c20159eM20979g.f63870z0;
                    handlerC6378d.sendMessage(handlerC6378d.obtainMessage(3));
                } else if (i11 == 0) {
                    c20159eM20979g.m20984h(new C19499b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f36044Y = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f36044Y = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f36044Y = bundle.getInt("resolution");
        }
        if (this.f36044Y != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                AbstractC15256t.m16465c("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                AbstractC15256t.m16465c("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                AbstractC20502t.m21157h(num);
                C19502e.f61950d.m20597d(this, num.intValue(), this);
                this.f36044Y = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f36044Y = 1;
            } catch (ActivityNotFoundException e10) {
                if (extras.getBoolean("notify_manager", true)) {
                    C20159e.m20979g(this).m20984h(new C19499b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strM11054l = AbstractC10763a.m11054l("Activity not found while launching ", pendingIntent.toString(), Separators.DOT);
                    if (Build.FINGERPRINT.contains("generic")) {
                        strM11054l = strM11054l.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    AbstractC15256t.m16466d("GoogleApiActivity", strM11054l, e10);
                }
                this.f36044Y = 1;
                finish();
            } catch (IntentSender.SendIntentException e11) {
                AbstractC15256t.m16466d("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f36044Y);
        super.onSaveInstanceState(bundle);
    }
}
