package p517V2;

import android.text.Editable;
import p468T2.C7229u;

/* JADX INFO: renamed from: V2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7740a extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f24408a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C7740a f24409b;

    /* JADX INFO: renamed from: c */
    public static Class f24410c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f24410c;
        return cls != null ? new C7229u(cls, charSequence) : super.newEditable(charSequence);
    }
}
