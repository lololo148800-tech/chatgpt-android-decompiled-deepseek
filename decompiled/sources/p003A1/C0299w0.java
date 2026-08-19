package p003A1;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.net.Uri;

/* JADX INFO: renamed from: A1.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0299w0 implements InterfaceC0309z1 {

    /* JADX INFO: renamed from: a */
    public final Context f1073a;

    public C0299w0(Context context) {
        this.f1073a = context;
    }

    @Override // p003A1.InterfaceC0309z1
    /* JADX INFO: renamed from: a */
    public final void mo877a(String str) {
        try {
            this.f1073a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException(AbstractC10763a.m11047e('.', "Can't open ", str), e10);
        }
    }
}
