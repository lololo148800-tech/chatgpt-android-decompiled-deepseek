package p008A6;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0237c1;
import p228J.AbstractC3812N;
import p292Lg.C5034f;
import p402Qc.C6589e;
import p402Qc.C6593i;
import p593Y8.C9683j;
import p749fd.C13628m;
import p801i5.C14932d;

/* JADX INFO: renamed from: A6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0387g extends AbstractC0237c1 {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f1297Z = 0;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC3812N f1298o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f1299p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0387g(C6589e c6589e, String conversationId, C6593i c6593i) {
        super(c6593i);
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f1298o0 = c6589e;
        this.f1299p0 = conversationId;
    }

    @Override // p003A1.AbstractC0237c1
    /* JADX INFO: renamed from: a */
    public final C14932d mo783a(C13628m c13628m) {
        String string;
        switch (this.f1297Z) {
            case 0:
                return ((C9683j) ((C0388h) this.f1298o0).f11539Z).m10279m(-1788979202, "SELECT key, record FROM records WHERE key=?", c13628m, 1, new C0386f(this, 2));
            case 1:
                Collection collection = (Collection) this.f1299p0;
                int size = collection.size();
                C0388h c0388h = (C0388h) this.f1298o0;
                if (size == 0) {
                    string = "()";
                } else {
                    StringBuilder sb2 = new StringBuilder(size + 2);
                    sb2.append("(?");
                    int i10 = size - 1;
                    for (int i11 = 0; i11 < i10; i11++) {
                        sb2.append(",?");
                    }
                    sb2.append(')');
                    string = sb2.toString();
                    AbstractC16544l.m18093f(string, "toString(...)");
                }
                return ((C9683j) c0388h.f11539Z).m10279m(null, "SELECT key, record FROM records WHERE key IN ".concat(string), c13628m, collection.size(), new C0386f(this, 3));
            default:
                C6589e c6589e = (C6589e) this.f1298o0;
                return ((C9683j) c6589e.f11539Z).m10279m(561484614, "SELECT DBMessage.id, DBMessage.conversationId, DBMessage.messageNode\nFROM DBMessage\nWHERE conversationId = ?", c13628m, 1, new C5034f(c6589e, 17, this));
        }
    }

    public final String toString() {
        switch (this.f1297Z) {
            case 0:
                return "json.sq:recordForKey";
            case 1:
                return "json.sq:recordsForKeys";
            default:
                return "Message.sq:getAllByConversationId";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0387g(C0388h c0388h, String key, C0386f c0386f) {
        super(c0386f);
        AbstractC16544l.m18094g(key, "key");
        this.f1298o0 = c0388h;
        this.f1299p0 = key;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0387g(C0388h c0388h, Collection collection, C0386f c0386f) {
        super(c0386f);
        this.f1298o0 = c0388h;
        this.f1299p0 = collection;
    }
}
