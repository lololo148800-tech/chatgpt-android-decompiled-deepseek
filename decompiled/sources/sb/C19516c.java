package sb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p817j$.util.DesugarTimeZone;
import p961qb.InterfaceC18665f;
import p961qb.InterfaceC18666g;

/* JADX INFO: renamed from: sb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C19516c implements InterfaceC18665f {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f61977a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f61977a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        ((InterfaceC18666g) obj2).mo8335d(f61977a.format((Date) obj));
    }
}
