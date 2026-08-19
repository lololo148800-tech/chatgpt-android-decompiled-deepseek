package p925oe;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p1081wc.C20887f;
import p1081wc.InterfaceC20904w;
import p1113xn.AbstractC21329w;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: oe.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C18095U {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20904w f57731a;

    /* JADX INFO: renamed from: b */
    public final Application f57732b;

    /* JADX INFO: renamed from: e */
    public String f57735e;

    /* JADX INFO: renamed from: c */
    public final ArrayList f57733c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f57734d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final List f57736f = AbstractC17681o.m19382k(new C18093S("android.intent.action.SEND", "android.intent.extra.TEXT", "single", C18119j.f57796p0, new C18094T(this, 0)), new C18093S("android.intent.action.SEND", "android.intent.extra.STREAM", "single", C18119j.f57797q0, new C18094T(this, 1)), new C18093S("android.intent.action.SEND_MULTIPLE", "android.intent.extra.STREAM", "multiple", C18119j.f57798r0, new C18094T(this, 2)));

    public C18095U(Application application, InterfaceC20904w interfaceC20904w) {
        this.f57731a = interfaceC20904w;
        this.f57732b = application;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX INFO: renamed from: a */
    public final void m19712a(Uri uri) {
        String mimeTypeFromExtension;
        String scheme = uri.getScheme();
        if (scheme == null) {
            mimeTypeFromExtension = "*/*";
        } else {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    mimeTypeFromExtension = this.f57732b.getContentResolver().getType(uri);
                } else {
                    mimeTypeFromExtension = "*/*";
                }
            } else if (scheme.equals("file")) {
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                AbstractC16544l.m18091d(fileExtensionFromUrl);
                String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
                AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
                mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
            } else {
                mimeTypeFromExtension = "*/*";
            }
        }
        String str = mimeTypeFromExtension != null ? mimeTypeFromExtension : "*/*";
        if (AbstractC21329w.m21734u(str, "image/", false)) {
            this.f57733c.add(uri);
        } else if (AbstractC21329w.m21734u(str, "text/", false) || AbstractC21329w.m21734u(str, "application/", false)) {
            this.f57734d.add(uri);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r4v2, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: b */
    public final void m19713b(Intent intent) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.f57736f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C18093S c18093s = (C18093S) next;
            if (AbstractC16544l.m18089b(intent.getAction(), c18093s.f57724a) && ((Boolean) c18093s.f57725b.invoke(intent)).booleanValue() && intent.hasExtra(c18093s.f57726c)) {
                break;
            }
        }
        C18093S c18093s2 = (C18093S) next;
        if (c18093s2 != null) {
            linkedHashMap.put("number", c18093s2.f57727d);
            String type = intent.getType();
            if (type != null) {
                linkedHashMap.put("type", type);
            }
            this.f57731a.mo21447a(C20887f.f66536k, linkedHashMap);
            c18093s2.f57728e.invoke(intent);
        }
    }
}
