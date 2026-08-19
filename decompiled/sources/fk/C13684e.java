package fk;

import android.content.Context;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p201Hn.C3523l;
import p201Hn.ExecutorC3515d;

/* JADX INFO: renamed from: fk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C13684e {

    /* JADX INFO: renamed from: a */
    public final File f43179a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0563B f43180b;

    public C13684e(Context context) {
        AbstractC16544l.m18094g(context, "context");
        this.f43179a = new File(context.getCacheDir(), "persona_log.csv");
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        AbstractC0575H.m1174c(AbstractC0593T.f1824a.plus(AbstractC0575H.m1175d()));
        ExecutorC3515d.f10633Z.getClass();
        this.f43180b = C3523l.f10647Z.mo1144Y0(1, null);
    }
}
