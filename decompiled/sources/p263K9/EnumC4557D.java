package p263K9;

/* JADX INFO: renamed from: K9.D */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4557D implements InterfaceC4579a {
    /* JADX INFO: Fake field, exist only in values array */
    RS256(-257),
    /* JADX INFO: Fake field, exist only in values array */
    RS384(-258),
    /* JADX INFO: Fake field, exist only in values array */
    RS512(-259),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_RS1(-262),
    /* JADX INFO: Fake field, exist only in values array */
    PS256(-37),
    /* JADX INFO: Fake field, exist only in values array */
    PS384(-38),
    /* JADX INFO: Fake field, exist only in values array */
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: Y */
    public final int f14894Y;

    EnumC4557D(int i10) {
        this.f14894Y = i10;
    }

    @Override // p263K9.InterfaceC4579a
    /* JADX INFO: renamed from: a */
    public final int mo5322a() {
        return this.f14894Y;
    }
}
