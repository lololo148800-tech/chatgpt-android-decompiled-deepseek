package kotlin.reflect.jvm.internal.impl.utils;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import p817j$.lang.Iterable$CC;
import p817j$.util.Collection;
import p817j$.util.List;
import vn.C20646c;
import vn.C20647d;

/* JADX INFO: loaded from: classes2.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess, List {

    /* JADX INFO: renamed from: Y */
    public int f53310Y;

    /* JADX INFO: renamed from: Z */
    public Object f53311Z;

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m18448f(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        int i10 = this.f53310Y;
        if (i10 == 0) {
            this.f53311Z = e10;
        } else if (i10 == 1) {
            this.f53311Z = new Object[]{this.f53311Z, e10};
        } else {
            Object[] objArr = (Object[]) this.f53311Z;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f53311Z = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f53310Y] = e10;
        }
        this.f53310Y++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f53311Z = null;
        this.f53310Y = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.lang.Iterable, p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f53310Y)) {
            return i11 == 1 ? (E) this.f53311Z : (E) ((Object[]) this.f53311Z)[i10];
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index: ", ", Size: ");
        sbM11057o.append(this.f53310Y);
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        int i10 = this.f53310Y;
        if (i10 == 0) {
            return C20646c.f65522Y;
        }
        if (i10 == 1) {
            return new C20647d(this);
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        m18448f(3);
        throw null;
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        E e10;
        if (i10 < 0 || i10 >= (i11 = this.f53310Y)) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index: ", ", Size: ");
            sbM11057o.append(this.f53310Y);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        if (i11 == 1) {
            e10 = (E) this.f53311Z;
            this.f53311Z = null;
        } else {
            Object[] objArr = (Object[]) this.f53311Z;
            Object obj = objArr[i10];
            if (i11 == 2) {
                this.f53311Z = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f53310Y - 1] = null;
            }
            e10 = (E) obj;
        }
        this.f53310Y--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, p817j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f53310Y)) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index: ", ", Size: ");
            sbM11057o.append(this.f53310Y);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        if (i11 == 1) {
            E e11 = (E) this.f53311Z;
            this.f53311Z = e10;
            return e11;
        }
        Object[] objArr = (Object[]) this.f53311Z;
        E e12 = (E) objArr[i10];
        objArr[i10] = e10;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f53310Y;
    }

    @Override // java.util.List, p817j$.util.List
    public void sort(Comparator<? super E> comparator) {
        int i10 = this.f53310Y;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f53311Z, 0, i10, comparator);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(List.CC.$default$spliterator(this));
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(Collection.CC.$default$stream(this));
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, p817j$.util.List, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, p817j$.util.Collection
    public final /* synthetic */ p817j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            m18448f(4);
            throw null;
        }
        int length = tArr.length;
        int i10 = this.f53310Y;
        if (i10 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f53311Z;
                return tArr2;
            }
            tArr[0] = this.f53311Z;
        } else {
            if (length < i10) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f53311Z, i10, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                m18448f(6);
                throw null;
            }
            if (i10 != 0) {
                System.arraycopy(this.f53311Z, 0, tArr, 0, i10);
            }
        }
        int i11 = this.f53310Y;
        if (length > i11) {
            tArr[i11] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f53310Y)) {
            if (i11 == 0) {
                this.f53311Z = e10;
            } else if (i11 == 1 && i10 == 0) {
                this.f53311Z = new Object[]{e10, this.f53311Z};
            } else {
                Object[] objArr = new Object[i11 + 1];
                if (i11 == 1) {
                    objArr[0] = this.f53311Z;
                } else {
                    Object[] objArr2 = (Object[]) this.f53311Z;
                    System.arraycopy(objArr2, 0, objArr, 0, i10);
                    System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f53310Y - i10);
                }
                objArr[i10] = e10;
                this.f53311Z = objArr;
            }
            this.f53310Y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index: ", ", Size: ");
        sbM11057o.append(this.f53310Y);
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }
}
