package p523V9;

/* JADX INFO: renamed from: V9.S4 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC7988S4 implements InterfaceC7968Q {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);


    /* JADX INFO: renamed from: Y */
    public final int f25266Y;

    EnumC7988S4(int i10) {
        this.f25266Y = i10;
    }

    @Override // p523V9.InterfaceC7968Q
    /* JADX INFO: renamed from: a */
    public final int mo8189a() {
        return this.f25266Y;
    }
}
