package p507Uh;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p474T8.C7270h;
import p474T8.C7271i;
import p474T8.InterfaceC7269g;
import p474T8.InterfaceC7272j;
import p571X9.AbstractC9196Q3;
import p571X9.AbstractC9209T;
import p893n.AbstractActivityC17375g;

/* JADX INFO: renamed from: Uh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C7679e implements InterfaceC7678d {

    /* JADX INFO: renamed from: a */
    public final String f24213a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7682h f24214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC7269g f24215c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC7683i f24216d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractActivityC17375g f24217e;

    public C7679e(InterfaceC7269g interfaceC7269g, InterfaceC7683i interfaceC7683i, AbstractActivityC17375g abstractActivityC17375g) {
        InterfaceC7682h c7680f;
        this.f24215c = interfaceC7269g;
        this.f24216d = interfaceC7683i;
        this.f24217e = abstractActivityC17375g;
        this.f24213a = interfaceC7269g.mo7728c();
        InterfaceC7272j interfaceC7272jMo7726a = interfaceC7269g.mo7726a();
        if (interfaceC7272jMo7726a instanceof C7270h) {
            if (AbstractC9196Q3.m9763e(interfaceC7269g.mo7726a())) {
                c7680f = new C7680f(true, false);
            } else {
                Integer num = (Integer) interfaceC7683i.mo7972a().get(interfaceC7269g.mo7728c());
                int iIntValue = num != null ? num.intValue() : 0;
                c7680f = iIntValue != 0 ? iIntValue != 1 ? new C7680f(true, true) : new C7680f(true, false) : new C7680f(false, false);
            }
        } else {
            if (!AbstractC16544l.m18089b(interfaceC7272jMo7726a, C7271i.f23054a)) {
                throw new C0644w();
            }
            c7680f = C7681g.f24220a;
        }
        this.f24214b = c7680f;
    }

    @Override // p507Uh.InterfaceC7678d
    /* JADX INFO: renamed from: a */
    public final InterfaceC7682h mo3586a() {
        return this.f24214b;
    }

    @Override // p507Uh.InterfaceC7678d
    /* JADX INFO: renamed from: b */
    public final void mo3587b() {
        C7681g c7681g = C7681g.f24220a;
        InterfaceC7682h interfaceC7682h = this.f24214b;
        if (AbstractC16544l.m18089b(interfaceC7682h, c7681g) || !(interfaceC7682h instanceof C7680f)) {
            return;
        }
        boolean z6 = ((C7680f) interfaceC7682h).f24219b;
        InterfaceC7683i interfaceC7683i = this.f24216d;
        InterfaceC7269g interfaceC7269g = this.f24215c;
        if (!z6) {
            interfaceC7683i.mo7973b(interfaceC7269g.mo7728c());
            interfaceC7269g.mo7727b();
            return;
        }
        interfaceC7683i.mo7973b(interfaceC7269g.mo7728c());
        AbstractActivityC17375g activity = this.f24217e;
        AbstractC16544l.m18094g(activity, "activity");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        AbstractC9209T.m9776b(activity, null, intent);
    }

    @Override // p507Uh.InterfaceC7678d
    /* JADX INFO: renamed from: c */
    public final String mo3588c() {
        return this.f24213a;
    }
}
