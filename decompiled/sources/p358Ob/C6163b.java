package p358Ob;

import java.sql.Timestamp;
import java.util.Date;
import p288Lb.AbstractC4973f;

/* JADX INFO: renamed from: Ob.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6163b extends AbstractC4973f {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f20068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6163b(int i10, Class cls) {
        super(cls);
        this.f20068c = i10;
    }

    @Override // p288Lb.AbstractC4973f
    /* JADX INFO: renamed from: a */
    public final Date mo5612a(Date date) {
        switch (this.f20068c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
