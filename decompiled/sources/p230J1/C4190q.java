package p230J1;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: renamed from: J1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C4190q implements InterfaceC4195v {
    @Override // p230J1.InterfaceC4195v
    /* JADX INFO: renamed from: a */
    public StaticLayout mo4884a(C4196w c4196w) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(c4196w.f13611a, c4196w.f13612b, c4196w.f13613c, c4196w.f13614d, c4196w.f13615e);
        builderObtain.setTextDirection(c4196w.f13616f);
        builderObtain.setAlignment(c4196w.f13617g);
        builderObtain.setMaxLines(c4196w.f13618h);
        builderObtain.setEllipsize(c4196w.f13619i);
        builderObtain.setEllipsizedWidth(c4196w.f13620j);
        builderObtain.setLineSpacing(c4196w.f13622l, c4196w.f13621k);
        builderObtain.setIncludePad(c4196w.f13624n);
        builderObtain.setBreakStrategy(c4196w.f13626p);
        builderObtain.setHyphenationFrequency(c4196w.f13629s);
        builderObtain.setIndents(c4196w.f13630t, c4196w.f13631u);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            AbstractC4191r.m4885a(builderObtain, c4196w.f13623m);
        }
        if (i10 >= 28) {
            AbstractC4192s.m4886a(builderObtain, c4196w.f13625o);
        }
        if (i10 >= 33) {
            AbstractC4193t.m4888b(builderObtain, c4196w.f13627q, c4196w.f13628r);
        }
        return builderObtain.build();
    }
}
