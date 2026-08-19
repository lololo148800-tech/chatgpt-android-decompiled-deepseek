package p826j6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.AbstractC11857B;
import com.google.android.gms.internal.play_billing.AbstractC11957g1;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11871F1;
import com.google.android.gms.internal.play_billing.C11907S;
import com.google.android.gms.internal.play_billing.C11918V1;
import com.google.android.gms.internal.play_billing.C11941c1;
import com.google.android.gms.internal.play_billing.C12027y;
import java.util.ArrayList;
import p001A.C0042V0;
import p813ij.C15026j;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j6.O */
/* JADX INFO: loaded from: classes.dex */
public final class C16146O extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public boolean f50104a;

    /* JADX INFO: renamed from: b */
    public final boolean f50105b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0042V0 f50106c;

    public C16146O(C0042V0 c0042v0, boolean z6) {
        this.f50106c = c0042v0;
        this.f50105b = z6;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m17745a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f50104a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f50105b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f50104a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m17746b(Context context) {
        if (!this.f50104a) {
            AbstractC11988o0.m13512g("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f50104a = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17747c(Bundle bundle, C16155i c16155i, int i10) {
        C11941c1 c11941c1M13455s;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((C15026j) this.f50106c.f207p0).m16153t(AbstractC16142K.m17717b(23, i10, c16155i));
                return;
            }
            C15026j c15026j = (C15026j) this.f50106c.f207p0;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            C11941c1 c11941c1 = C11941c1.f36239b;
            if (c11941c1 == null) {
                synchronized (C11941c1.class) {
                    try {
                        c11941c1M13455s = C11941c1.f36239b;
                        if (c11941c1M13455s == null) {
                            C11871F1 c11871f1 = C11871F1.f36125c;
                            c11941c1M13455s = AbstractC11957g1.m13455s();
                            C11941c1.f36239b = c11941c1M13455s;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c11941c1 = c11941c1M13455s;
            }
            c15026j.m16153t(C11918V1.m13356n(byteArray, c11941c1));
        } catch (Throwable unused) {
            AbstractC11988o0.m13512g("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        C0042V0 c0042v0 = this.f50106c;
        if (extras == null) {
            AbstractC11988o0.m13512g("BillingBroadcastManager", "Bundle is null.");
            C15026j c15026j = (C15026j) c0042v0.f207p0;
            C16155i c16155i = AbstractC16144M.f50086i;
            c15026j.m16153t(AbstractC16142K.m17717b(11, 1, c16155i));
            InterfaceC16165s interfaceC16165s = (InterfaceC16165s) c0042v0.f206o0;
            if (interfaceC16165s != null) {
                interfaceC16165s.onPurchasesUpdated(c16155i, null);
                return;
            }
            return;
        }
        C16155i c16155iM13509d = AbstractC11988o0.m13509d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i10 = true != Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 1 : 2;
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (c16155iM13509d.f50151a != 0) {
                    m17747c(extras, c16155iM13509d, i10);
                    InterfaceC16165s interfaceC16165s2 = (InterfaceC16165s) c0042v0.f206o0;
                    C12027y c12027y = AbstractC11857B.f36097Z;
                    interfaceC16165s2.onPurchasesUpdated(c16155iM13509d, C11907S.f36188q0);
                    return;
                }
                c0042v0.getClass();
                AbstractC11988o0.m13512g("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                C16155i c16155i2 = AbstractC16144M.f50086i;
                ((C15026j) c0042v0.f207p0).m16153t(AbstractC16142K.m17717b(77, i10, c16155i2));
                C12027y c12027y2 = AbstractC11857B.f36097Z;
                ((InterfaceC16165s) c0042v0.f206o0).onPurchasesUpdated(c16155i2, C11907S.f36188q0);
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseM13515j = AbstractC11988o0.m13515j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseM13515j == null) {
                AbstractC11988o0.m13511f("BillingHelper", "Couldn't find single purchase data as well.");
            } else {
                arrayList2.add(purchaseM13515j);
            }
            if (c16155iM13509d.f50151a == 0) {
                ((C15026j) c0042v0.f207p0).m16155v(AbstractC16142K.m17719d(i10));
            } else {
                m17747c(extras, c16155iM13509d, i10);
            }
            ((InterfaceC16165s) c0042v0.f206o0).onPurchasesUpdated(c16155iM13509d, arrayList);
        }
        AbstractC11988o0.m13511f("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i11 = 0; i11 < stringArrayList.size() && i11 < stringArrayList2.size(); i11++) {
            Purchase purchaseM13515j2 = AbstractC11988o0.m13515j(stringArrayList.get(i11), stringArrayList2.get(i11));
            if (purchaseM13515j2 != null) {
                arrayList2.add(purchaseM13515j2);
            }
        }
        arrayList = arrayList2;
        if (c16155iM13509d.f50151a == 0) {
            ((C15026j) c0042v0.f207p0).m16155v(AbstractC16142K.m17719d(i10));
        } else {
            m17747c(extras, c16155iM13509d, i10);
        }
        ((InterfaceC16165s) c0042v0.f206o0).onPurchasesUpdated(c16155iM13509d, arrayList);
    }
}
