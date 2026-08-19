package p500Ua;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.revenuecat.purchases.google.C12734c;
import p746fa.C13599h;
import p826j6.C16157k;

/* JADX INFO: renamed from: Ua.c */
/* JADX INFO: loaded from: classes.dex */
public final class ResultReceiverC7594c extends ResultReceiver {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24017Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f24018Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResultReceiverC7594c(Handler handler, Object obj, int i10) {
        super(handler);
        this.f24017Y = i10;
        this.f24018Z = obj;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        C16157k c16157k;
        Object obj = this.f24018Z;
        switch (this.f24017Y) {
            case 0:
                ((C13599h) obj).m15116d(null);
                break;
            default:
                int i11 = AbstractC11988o0.f36308a;
                if (bundle == null) {
                    c16157k = new C16157k(0);
                } else {
                    int i12 = bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
                    c16157k = new C16157k(i12);
                }
                ((C12734c) obj).m14477a(c16157k);
                break;
        }
    }
}
