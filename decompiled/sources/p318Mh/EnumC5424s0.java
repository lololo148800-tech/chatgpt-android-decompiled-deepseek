package p318Mh;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v4 Mh.s0[], still in use, count: 1, list:
  (r9v4 Mh.s0[]) from 0x00a7: INVOKE (r9v4 Mh.s0[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:168)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: Mh.s0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC5424s0 {
    Settings("settings"),
    /* JADX INFO: Fake field, exist only in values array */
    DeveloperSettings("developer_settings"),
    DeepLink("deep_link"),
    /* JADX INFO: Fake field, exist only in values array */
    CameraShortcut("camera_shortcut"),
    /* JADX INFO: Fake field, exist only in values array */
    GalleryShortcut("gallery_shortcut"),
    ConversationTopBar("conversation_top_bar"),
    GizmoText("gizmo_text"),
    UpgradedMessage("upgraded_message"),
    RateLimitBanner("rate_limit_banner"),
    RateLimitBottomSheet("rate_limit_bottom_sheet"),
    VoiceLimitBottomSheet("voice_limit_bottom_sheet");

    public static final C5422r0 Companion;

    /* JADX INFO: renamed from: Z */
    public static final Object f17716Z;

    /* JADX INFO: renamed from: Y */
    public final String f17726Y;

    static {
        AbstractC7877E4.m8156j(enumC5424s0Arr);
        Companion = new C5422r0();
        f17716Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C5417p.f17704p0);
    }

    public EnumC5424s0(String str) {
        super(str, i);
        this.f17726Y = str;
    }

    public static EnumC5424s0 valueOf(String str) {
        return (EnumC5424s0) Enum.valueOf(EnumC5424s0.class, str);
    }

    public static EnumC5424s0[] values() {
        return (EnumC5424s0[]) f17725w0.clone();
    }
}
