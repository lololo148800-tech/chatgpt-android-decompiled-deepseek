package p1044uj;

import android.content.Context;
import android.widget.Toast;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p086D6.C1970n;
import p103Dn.InterfaceC2184i;
import p385Pj.C6446u;
import p523V9.AbstractC8191s5;
import p729ej.InterfaceC13427r;
import p841k.AbstractC16283c;
import p913o2.AbstractC17806g;

/* JADX INFO: renamed from: uj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20334f implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final AbstractC16283c f64293b;

    /* JADX INFO: renamed from: c */
    public final Context f64294c;

    /* JADX INFO: renamed from: d */
    public int f64295d;

    public C20334f(AbstractC16283c pictureLauncher, Context context) {
        AbstractC16544l.m18094g(pictureLauncher, "pictureLauncher");
        this.f64293b = pictureLauncher;
        this.f64294c = context;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r interfaceC13427r) {
        return AbstractC8191s5.m8780h(this, interfaceC13427r);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21038b(String str) {
        Context context = this.f64294c;
        try {
            this.f64293b.mo10188b(AbstractC17806g.getUriForFile(context, context.getPackageName() + ".persona.provider", new File(context.getExternalFilesDir(""), "document_camera_photo_time.jpg")));
            return true;
        } catch (IllegalArgumentException unused) {
            Toast.makeText(context, str, 0).show();
            return false;
        }
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C1970n(new C6446u(), 26, this);
    }
}
