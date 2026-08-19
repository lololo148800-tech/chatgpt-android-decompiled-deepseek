package p1058v7;

import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;

/* JADX INFO: renamed from: v7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20469a implements FileFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C20472d f64976a;

    public C20469a(C20472d c20472d) {
        this.f64976a = c20472d;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file == null) {
            return false;
        }
        this.f64976a.getClass();
        String name = file.getName();
        AbstractC16544l.m18093f(name, "name");
        return AbstractC21329w.m21738y(name) != null;
    }
}
