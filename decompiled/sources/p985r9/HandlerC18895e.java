package p985r9;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.util.regex.Matcher;
import p377P9.HandlerC6378d;
import p692d0.C12959L;
import p817j$.util.Objects;

/* JADX INFO: renamed from: r9.e */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC18895e extends HandlerC6378d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C18892b f60243a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC18895e(C18892b c18892b, Looper looper) {
        super(looper);
        this.f60243a = c18892b;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C18892b c18892b = this.f60243a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C18896f());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C18897g) {
                        c18892b.f60237g = (C18897g) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c18892b.f60236f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = C18892b.f60230j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c18892b.m20207d(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    AbstractC15256t.m16482t("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c18892b.f60231a) {
                        int i10 = 0;
                        while (true) {
                            try {
                                C12959L c12959l = c18892b.f60231a;
                                if (i10 < c12959l.f41154o0) {
                                    c18892b.m20207d((String) c12959l.m14646f(i10), intent2.getExtras());
                                    i10++;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    AbstractC15256t.m16482t("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                c18892b.m20207d(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        AbstractC15256t.m16482t("Rpc", "Dropping invalid message");
    }
}
