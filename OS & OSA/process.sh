echo "Starting child:"
sleep 10 &
echo "The child is $!"
echo "The parent is $$"
echo "$(date): Parent waits."
wait
echo "The child $! has the exit status $?"
echo "$(date): Parent woke up."

